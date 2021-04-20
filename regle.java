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
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
	
	public class regle extends JFrame{
			public regle(){
				super();
				this.setTitle("règle");
				this.setSize(1400,780);
				// Pour placer la fenÃªtre au centre de l'Ã©cran
				this.setLocationRelativeTo(null);
				//Pour empÃªcher le redimensionnement de la fenÃªtre
				this.setResizable(false);
				// Pour permettre la fermeture de la fenÃªtre lors de l'appui sur la croix rouge
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// mon panneau gÃ©nÃ©ral
	
				JPanel panneau = new JPanel();
				panneau.setBounds(0,0,this.getWidth(),this.getHeight());
				panneau.setLayout(null);
				
				//panneau fond
				JLabel Fond = new JLabel(new ImageIcon("Capture.png"));
				Fond.setBounds(0,0,this.getWidth(),this.getHeight());
	
				panneau.add(Fond);
				add(panneau);
				setVisible(true);
			}
	}
