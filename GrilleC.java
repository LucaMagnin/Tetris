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

public class GrilleC extends JPanel implements KeyListener{ //la grille est un panneau
	ControleGrille monControleGrille=new ControleGrille();
	

	/*public static void main(String args[]) {
		
		GrilleC PanneaumaGrille = new GrilleC(); // crÃ©ation du panneau PanneaumaGrille
		 			
		//PanneaumaGrille.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );   
		}  */
		
	public GrilleC(){
		super();
		JPanel PanneaumaGrille = this;
		monControleGrille.initialiserGrille();
		initialiserTimer();


	}
 
	public void paintComponent(Graphics g){ 
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
				}
				monControleGrille.Descendre();
				repaint();
			}
		},200,200);
	}
	

	
		public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
					case KeyEvent.VK_UP:
				
						break;
					case KeyEvent.VK_DOWN:
					
						break;
					case KeyEvent.VK_LEFT:
						monControleGrille.DeplacementAGauche();
						break;
					case KeyEvent.VK_RIGHT:
						monControleGrille.DeplacementADroite();
						break;
					case KeyEvent.VK_SPACE:
						monControleGrille.RotationDroite();

						break;
					} 
				}
		public void keyReleased(KeyEvent e) {
			
		}
		public void keyTyped(KeyEvent e) {
			
		}


	
		
}
 
