import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.*;

public class GrilleC extends JPanel { //la grille est un panneau
	
	/*public static void main(String args[]) {
		
		GrilleC PanneaumaGrille = new GrilleC(); // crÃ©ation du panneau PanneaumaGrille
		 			
		//PanneaumaGrille.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );   
		}  */
		
	public GrilleC(){
		super();
		JPanel PanneaumaGrille = this;
	}
 
	public void paint(Graphics g){ 
		for(int x =320; x <= 700; x += 40 ){
			for(int y = 100; y <= 680; y += 40 ){ 
			g.drawRect(x,y,40,40);
			}
		}

	} 
		 }
 
