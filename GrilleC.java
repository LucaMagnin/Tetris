import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;

public class GrilleC extends JPanel { //la grille est un panneau
	ControleGrille monControleGrille=new ControleGrille();
		
	public GrilleC(){
		super();
		JPanel PanneaumaGrille = this;
		monControleGrille.initialiserGrille();
		initialiserTimer();


	}
 
	public void paint(Graphics g){ 
		int i=0;

		for(int x =100; x <= 420; x += 28 ){
			int j=0;
			for(int y = 100; y <= 670; y += 28 ){ 
				g.setColor(monControleGrille.grille[j][i]);
				g.fillRect(x+1,y+1,26,26);
				g.drawRect(x,y,28,28);
				j++;

			}
			i++;
		}
		DessinerPiece(g);
		
	} 
	
	public void DessinerPiece(Graphics g){
		for(int i=0;i<4;i++){
			g.setColor(monControleGrille.tetraminoActuel.couleurTetra);
			int origineX=100+(monControleGrille.tetraminoActuel.origineTetramino.x+monControleGrille.tetraminoActuel.coordsTetrimino[i].x)*28+1;
			int origineY=100+(monControleGrille.tetraminoActuel.origineTetramino.y+monControleGrille.tetraminoActuel.coordsTetrimino[i].y)*28+1;
			g.fillRect(origineX,origineY,26,26);
		}
	}
	
	public void initialiserTimer(){
		Timer chrono = new Timer();
		chrono.schedule(new TimerTask(){
			public void run(){
				if(monControleGrille.perdu){
					chrono.cancel();
					new gameOver();
				} else{
					monControleGrille.Descendre();
					repaint();
					
				}
			}
		},600,600);
	}
			
}
 
