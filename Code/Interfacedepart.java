import javax.swing.*;import java.awt.*;import java.awt.event.*;import java.io.*;/** * Classe de l'interface du depart * */public class Interfacedepart extends JFrame {	// Les Widgets a  declarer en dehors du constructeur		public FenetreTetris f; 	public JTextField textNom;	private JButton Start;	private JButton Quitter;	public JButton regles;	private Font policeTetris;			public Interfacedepart() { //Constructeur		super();		this.setTitle("Jeu Tetris");		this.setSize(600,480);		// Pour placer la fenetre au centre de l'ecran		this.setLocationRelativeTo(null);		//Pour empecher le redimensionnement de la fenetre		this.setResizable(false);		// Pour permettre la fermeture de la fenetre lors de l'appui sur la croix rouge		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				// mon panneau general		JPanel panneauGeneral = new JPanel();		panneauGeneral.setBounds(0,0,this.getWidth(),this.getHeight());		panneauGeneral.setLayout(null);		add(panneauGeneral);				// mon bouton Start		JButton Start = new JButton("Start");		Start.setBounds(60,280,150,50);		Start.addActionListener(new EcouteurStart(this));		panneauGeneral.add(Start);				// mon bouton Quitter		JButton Quitter = new JButton("Quitter");		Quitter.setBounds(220,280,150,50);		panneauGeneral.add(Quitter);		Quitter.addActionListener(new EcouteurQuitter(this));			//Bouton pour avoir les regles du jeu 		JButton regles = new JButton("Règles");		regles.setBounds(380,280,150,50);		panneauGeneral.add(regles); 				regles.addActionListener(new EcouteurRegles(this));				//panneau Logo		JPanel panneauLogo = new JPanel();		panneauLogo.setBackground(Color.green);		panneauGeneral.add(panneauLogo);		JLabel Titrejeu = new JLabel();				//Permet d'utiliser une police que l'on importe, ici, c'est la police Tetris qui est utilisee		try {			policeTetris = Font.createFont(Font.TRUETYPE_FONT, new File("./Ressources/Tetris.ttf")).deriveFont(60f);				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("./Ressources/Tetris.ttf")));					}		catch(IOException | FontFormatException e){			}		Titrejeu.setFont(policeTetris);			Titrejeu.setText("Tetris 2021");		Titrejeu.setBounds(120,40,400,50);		Titrejeu.setForeground(Color.white);		panneauGeneral.add(Titrejeu);				//logo du jeu		JLabel LogoTetris = new JLabel(new ImageIcon("./Ressources/logo_tetris1.png"));		LogoTetris.setBounds(220,90,150,150);		panneauGeneral.add(LogoTetris);					//panneau fond		JLabel Fond = new JLabel(new ImageIcon("./Ressources/fond_jeu.png"));		Fond.setBounds(0,0,this.getWidth(),this.getHeight());		panneauGeneral.add(Fond);					// Pour rendre la fenetre visible		this.setVisible(true);	}	//Methode fermant la fenêtre	public void fermeFen() {		dispose();	}					}