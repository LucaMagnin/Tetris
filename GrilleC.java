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

		for(int x =500; x <= 820; x += 28 ){
			int j=0;
			for(int y = 25; y <= 595; y += 28 ){ 
				g.setColor(monControleGrille.grille[j][i]);
				g.fillRect(x+1,y+1,26,26);
				g.drawRect(x,y,28,28);
				j++;

			}
			i++;
		}
		DessinerTetraActuel(g);
		DessinerTetraHold(g);
		DessinerTetraSuivant(g);
		AfficherScore(g);
		AfficherNiveau(g);
	} 
	
	public void DessinerTetraActuel(Graphics g){
		for(int i=0;i<4;i++){
			
			int origineX=500+(monControleGrille.tetraminoActuel.origineTetramino.x+monControleGrille.tetraminoActuel.coordsTetrimino[i].x)*28+1;
			int origineY=25+(monControleGrille.tetraminoActuel.origineTetramino.y+monControleGrille.tetraminoActuel.coordsTetrimino[i].y)*28+1;
			g.setColor(monControleGrille.tetraminoActuel.couleurTetra);
			g.fillRect(origineX,origineY,26,26);
		}
	}
	
	public void DessinerTetraHold(Graphics g){
		g.setColor(new Color(32,74,200));
		g.fillRect(275,65,140,130);
		for(int i=0;i<4;i++){
			int origineX=325+monControleGrille.tetraminoHold.coordsTetrimino[i].x*25+1;
			int origineY=115+(monControleGrille.tetraminoHold.coordsTetrimino[i].y)*25+1;
			g.setColor(monControleGrille.tetraminoHold.couleurTetra);
			g.fillRect(origineX,origineY,25,25);
		}
	}
	
	public void DessinerTetraSuivant(Graphics g){
		g.setColor(new Color(32,74,200));
		g.fillRect(925,65,140,130);
		for(int i=0;i<4;i++){
			g.setColor(monControleGrille.tetraminoSuivant.couleurTetra);
			int origineX=975+monControleGrille.tetraminoSuivant.coordsTetrimino[i].x*25+1;
			int origineY=115+(monControleGrille.tetraminoSuivant.coordsTetrimino[i].y)*25+1;
			g.fillRect(origineX,origineY,25,25);
		}
	}
	
	public void AfficherScore(Graphics g){
		g.setColor(new Color(32,74,200));
		g.fillRect(950,550,70,50);
		Font fonte = new Font("TimesRoman ",Font.BOLD,30);
		g.setFont(fonte);
		g.setColor(Color.white);
		g.drawString(Integer.toString(monControleGrille.score),950,600);
	}
	
	public void AfficherNiveau(Graphics g){
		g.setColor(new Color(32,74,200));
		g.fillRect(250,550,100,70);
		Font fonte = new Font("TimesRoman ",Font.BOLD,40);
		g.setFont(fonte);
		g.setColor(Color.white);
		g.drawString(Integer.toString(monControleGrille.niveau),300,600);
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
 
