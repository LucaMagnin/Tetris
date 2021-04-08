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
	
	public static void main(String args[]) {
		
		GrilleC PanneaumaGrille = new GrilleC(); // création du panneau PanneaumaGrille
		 			
		//PanneaumaGrille.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );   
		}  
 
	public void paint(Graphics g){  
		for(int x =120; x <= 300; x += 30 ){
			for(int y = 100; y <= 500; y += 30 ){ 
			g.drawRect(x,y,30,30); //ceci est un test
			}
		}

	} 
		 }
 
	



