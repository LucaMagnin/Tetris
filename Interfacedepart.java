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



public class Interfacedepart extends JFrame implements ActionListener{
		
		public static void main (String[] args)  {
		
		// Création de la fenêtre JFrame pour l'IHM
		Interfacedepart monInterfacedepart  = new Interfacedepart ();}
		
	// Les Widgets à déclarer en dehors du constructeur
	private JTextField textNom;
	private JButton Start;
	private JButton Quitter;

	
	public Interfacedepart(){
		
		super();
		this.setTitle("Jeu Tetris");
		this.setSize(600,500);
		// Pour placer la fenêtre au centre de l'écran
		this.setLocationRelativeTo(null);
		//Pour empêcher le redimensionnement de la fenêtre
		this.setResizable(false);
		// Pour permettre la fermeture de la fenêtre lors de l'appui sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	// mon panneau général
	
	JPanel panneauGeneral = new JPanel();
	panneauGeneral.setBounds(0,0,this.getWidth(),this.getHeight());
	panneauGeneral.setLayout(null);
	add(panneauGeneral);
	
	
	
	// Panneau boutons
	JPanel panneauBoutons = new JPanel();
	panneauBoutons.setBounds(100,200,140,140);
	panneauBoutons.setBackground(Color.white);
	
	JButton Start = new JButton("Start");
	Start.setBounds(120,280,150,50);
	//panneauBoutons.add(Start);
	Start.addActionListener(this);
	
	panneauGeneral.add(Start);
	
	
	JButton Quitter = new JButton("Quitter");
	Quitter.setBounds(320,280,150,50);
	//panneauBoutons.add(Quitter);
	//panneauGeneral.add(panneauBoutons);
	Quitter.addActionListener(this);
	panneauGeneral.add(Quitter);

	//this.add(panneauBoutons,BorderLayout.CENTER);
	//this.add(Quitter,BorderLayout.CENTER);
	//Start.setLayout(new FlowLayout(300,100,50));
	//Quitter.setLayout(new FlowLayout(300,100,50));
	
	
	//panneau qui demande le nom
	
	JPanel panneauNom = new JPanel();
	panneauNom.setBackground(Color.white);
	
		JLabel affNom = new JLabel();
		Font police = new Font(" Arial ",Font.BOLD,18);
		affNom.setFont(police);
		affNom.setText("Entrez votre nom");
		affNom.setBounds(120,390,340,50);
		affNom.setForeground(Color.white);
	//panneauNom.add(affNom);
	panneauGeneral.add(affNom);
		
		JTextField textNom = new JTextField();
		textNom.setBounds(300,400,200,30);
		//panneauNom.add(textNom);
		panneauGeneral.add(textNom);
	//panneauGeneral.add(panneauNom);

	
	//panneauNom.setLayout(new FlowLayout((FlowLayout.CENTER)));
	
	//this.add(panneauNom,BorderLayout.PAGE_START);
	
	//panneau Logo
	JPanel panneauLogo = new JPanel();
	panneauLogo.setBackground(Color.green);
	
	panneauGeneral.add(panneauLogo);
	
	JLabel Titrejeu = new JLabel();
	Font policetitre = new Font(" Arial ",Font.BOLD,60);
		Titrejeu.setFont(policetitre);	
		Titrejeu.setText("Tetris 2021");
		Titrejeu.setBounds(130,40,340,50);
		Titrejeu.setForeground(Color.white);
	//panneauNom.add(affNom);
	panneauGeneral.add(Titrejeu);
	
	
	//logo du jeu
	JLabel LogoTetris = new JLabel(new ImageIcon("./logo_tetris1.png"));
	LogoTetris.setBounds(220,105,150,150);
	panneauGeneral.add(LogoTetris);
	
	
	
	//this.add(panneauLogo,BorderLayout.PAGE_START); 
			
	//panneau fond
	JLabel Fond = new JLabel(new ImageIcon("./fond_jeu.png"));
	Fond.setBounds(0,0,this.getWidth(),this.getHeight());
	
	panneauGeneral.add(Fond);	
	

		
	// Pour rendre la fenêtre visible
	this.setVisible(true);
	
	
	}

	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == Start){
			new GrilleC().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource() == Quitter){	
			//this.setVisible(false);
			//this.dispose();
			System.exit(0);
		}
		 
	}	
		
	
 
	
 
	
	

	
	
	
	



}
