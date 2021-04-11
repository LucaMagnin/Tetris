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

	/*public static void main(String args[]) {
		
		GrilleC PanneaumaGrille = new GrilleC(); // crÃ©ation du panneau PanneaumaGrille
		 			
		//PanneaumaGrille.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );   
		}  */
		
	public GrilleC(){
		super();
		JPanel PanneaumaGrille = this;
		monControleGrille.initialiserGrille();

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

	} 
	public void initialiserTimer(){
		Timer chrono = new Timer();
		chrono.schedule(new TimerTask(){
			public void run(){
				monControleGrille.Descendre();
				repaint();
			}
		},1000,1000);
	}
}
 
