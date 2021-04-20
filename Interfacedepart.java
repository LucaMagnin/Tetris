
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;


public class Interfacedepart extends JFrame{
		
		
	// Les Widgets Ã  dÃ©clarer en dehors du constructeur
	private JTextField textNom;
	private JButton Start;
	private JButton Quitter;
	public FenetreTetris f;
	private Font policeTetris;
	private Audio monson;
	
	public Interfacedepart(){
		
		super();
		this.setTitle("Jeu Tetris");
		this.setSize(600,480);
		// Pour placer la fenÃªtre au centre de l'Ã©cran
		this.setLocationRelativeTo(null);
		//Pour empÃªcher le redimensionnement de la fenÃªtre
		this.setResizable(false);
		// Pour permettre la fermeture de la fenÃªtre lors de l'appui sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		monson = new Audio();
		monson.start();
		
	// mon panneau gÃ©nÃ©ral
	
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
	Start.addActionListener(new EcouteurStart(this));
	
	panneauGeneral.add(Start);
	
	
	JButton Quitter = new JButton("Quitter");
	Quitter.setBounds(320,280,150,50);
	//panneauBoutons.add(Quitter);
	panneauGeneral.add(Quitter);
	//panneauGeneral.add(panneauBoutons);
	Quitter.addActionListener(new EcouteurQuitter(this));
	
	
	//panneau qui demande le nom
	
	JPanel panneauNom = new JPanel();
	panneauNom.setBackground(Color.white);
	
		JLabel affNom = new JLabel();
		Font police = new Font(" Arial ",Font.BOLD,18);
		affNom.setFont(police);
		affNom.setText("Entrez votre nom");
		affNom.setBounds(120,390,340,50);
		affNom.setForeground(Color.white);
		panneauGeneral.add(affNom);
		
		JTextField textNom = new JTextField();
		textNom.setBounds(300,400,200,30);
		panneauGeneral.add(textNom);

	//panneau Logo
	JPanel panneauLogo = new JPanel();
	panneauLogo.setBackground(Color.green);
	
	panneauGeneral.add(panneauLogo);
	
	JLabel Titrejeu = new JLabel();
	
	try{
            // load a custom font in your project folder
            
			policeTetris = Font.createFont(Font.TRUETYPE_FONT, new File("Tetris.ttf")).deriveFont(60f);	
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Tetris.ttf")));			
		}
		catch(IOException | FontFormatException e){
			
		}
		Titrejeu.setFont(policeTetris);	
		Titrejeu.setText("Tetris 2021");
		Titrejeu.setBounds(120,40,400,50);
		Titrejeu.setForeground(Color.white);
	panneauGeneral.add(Titrejeu);
	
	
	//logo du jeu
	JLabel LogoTetris = new JLabel(new ImageIcon("./logo_tetris1.png"));
	LogoTetris.setBounds(220,90,150,150);
	panneauGeneral.add(LogoTetris);
			
	//panneau fond
	JLabel Fond = new JLabel(new ImageIcon("./fond_jeu.png"));
	Fond.setBounds(0,0,this.getWidth(),this.getHeight());
	
	panneauGeneral.add(Fond);	
	

		
	// Pour rendre la fenÃªtre visible
	this.setVisible(true);

	
	}
	
	public void fermeFen(){
		dispose();
	}
	public class EcouteurStart implements ActionListener{
		private Interfacedepart dep;
	
		public EcouteurStart(Interfacedepart dep){
			this.dep=dep;
		}
	
		public void actionPerformed(ActionEvent e)  {
			f =new FenetreTetris();
			dep.fermeFen();
 
		} 
	}	
	public class EcouteurQuitter implements ActionListener{
		private Interfacedepart dep;
	
		public EcouteurQuitter(Interfacedepart dep){
			this.dep=dep;
		}
	
		public void actionPerformed(ActionEvent e)  {
			dep.fermeFen();
 
		} 
	}

}
