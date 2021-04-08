import java.util.LinkedList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class FenetreTetris extends JFrame { 
	
   
	//attributs
	private JButton boutonDescendre; // a changer avec clavier apres 
    private JButton boutonTourner;
    //final JButton button = new JButton("Bouton");
    // button.addKeyListener(new KeyListener());
    private JLabel tetraminosnext1;
    private JLabel tetraminosnext2;
    private JLabel level;
    private JLabel score;
	private JLabel linestoclear;
	public Interfacedepart interfaceDep;

		/*public void keyPressed(KeyEvent e)
		{	
			Point p = button.getLocation();
			switch (e.getKeyCode())
			{
				case KeyEvent.VK_RIGHT:
					button.setLocation(p.x+1, p.y);
					break;
				case KeyEvent.VK_DOWN:
					button.setLocation(p.x, p.y+1);
					break;
			}
		}

		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {} */
		

	
	public FenetreTetris (Interfacedepart i){   //    LinkedList<Tetraminos> maListeCourbe quand j'aurai la liste de tetraminos 
		
        super(); 
        
        interfaceDep= i;
        
		// la fenÃƒÂªtre existe dÃƒÂ©jÃƒ  (crÃƒÂ©ÃƒÂ©e dans GestionCourbe) : on la paramÃƒÂ¨tre
        setTitle("TETRIS GAME ");
        setSize(1285,675); 
        // Pour placer la fenÃƒÆ’Ã‚Âªtre au centre de l'ÃƒÆ’Ã‚Â©cran
		this.setLocationRelativeTo(null);
		//Pour empÃƒÆ’Ã‚Âªcher le redimensionnement de la fenÃƒÆ’Ã‚Âªtre
		this.setResizable(false);
		// Pour permettre la fermeture de la fenÃƒÆ’Ã‚Âªtre lors de l'appui sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// mon panneau global
	
	JPanel panneauGeneral = new JPanel();
	panneauGeneral.setBounds(0,0,this.getWidth(),this.getHeight());
	panneauGeneral.setLayout(null);
	add(panneauGeneral);
		
		
		 // Conteneur 1 contient un JLabel consigne
        JLabel tetraminosnext1 = new JLabel();
        tetraminosnext1.setText("HOLD");
        tetraminosnext1.setBounds(30,0,60,20); // x,y
        tetraminosnext1.setForeground(Color.white);
        tetraminosnext1.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,17));
        
        // Conteneur 2 contient un JLabel consigne
        JLabel tetraminosnext2 = new JLabel();
        tetraminosnext2.setText("NEXT");
        tetraminosnext2.setBounds(30,0,60,20);
        tetraminosnext2.setForeground(Color.white);
        tetraminosnext2.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,17));
        
        // Conteneur 3 contient un JLabel consigne
        JLabel level = new JLabel();
        level.setText("LEVEL");
        level.setBounds(30,0,60,20);
        level.setForeground(Color.white);
        level.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,17));
        
        // Conteneur 4 contient un JTextFiled saisie
        JLabel score = new JLabel();
        score.setText("SCORE");
        score.setBounds(35,0,60,14);
        score.setForeground(Color.white);
        score.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,13));
		
		
		JPanel Conteneur1 = new JPanel() ;
        Conteneur1.setLayout(null);
        Conteneur1.setBounds(250,25,120,80);
        Conteneur1.setBackground(new Color(21,47,128));
        Conteneur1.add(tetraminosnext1);
		
		JPanel Conteneur2 = new JPanel() ;
        Conteneur2.setLayout(null);
        Conteneur2.setBounds(900,25,120,80);
        Conteneur2.setBackground(new Color(21,47,128));
        Conteneur2.add(tetraminosnext2);
        
        JPanel Conteneur3 = new JPanel() ;
        Conteneur3.setLayout(null);
        Conteneur3.setBounds(250,520,120,100);
        Conteneur3.setBackground(new Color(32,74,200));
        Conteneur3.add(level);
		
		JPanel Conteneur4 = new JPanel() ;
        Conteneur4.setLayout(null);
        Conteneur4.setBounds(900,530,120,60);
        Conteneur4.setBackground(new Color(32,74,200));
        Conteneur4.add(score);
        
        panneauGeneral.add(Conteneur1);
        panneauGeneral.add(Conteneur2);
        panneauGeneral.add(Conteneur3);
        panneauGeneral.add(Conteneur4); 
       
        this.setVisible(true);
        
        
        //panneau fond
	JLabel Fond1 = new JLabel(new ImageIcon("./Tetris-blockst.png"));
	Fond1.setBounds(-10,0,1300,650);
	
	panneauGeneral.add(Fond1);	
	
	//ajout panneau Grille
        this.getContentPane().add(new GrilleC());
        JPanel PanneaumaGrille = new JPanel();
        PanneaumaGrille.setLayout(null);
        PanneaumaGrille.setBounds(100,160,60,30);
        this.add(PanneaumaGrille);
        
        
        }}
        
        /*JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(10, // nb de cases dans une ligne
      20, // nb de cases dans une colonne
      1, // Ã©paisseur des traits horizontaux
      1)); // Ã©paisseur des traits verticaux
		panel.setBackground(Color.BLACK); // Couleur des traits
        
        panneauGeneral.add(panel);*/
        
        
        
        
       
	
	/*public grille {
		final int H = 20; // hauteur (en nombre de cellules )
		final int L = 10; // largeur
		boolean [][] grille = genererMondeAleatoire (H,L ,0.7) ;
		affichergrille ( grille ) ;
	}

	public static void afficherMonde ( boolean [][] monde ) {
	     // a faire voir code LUCA du jeu de la vie 
	}
	
	
	public static boolean [][] gererTetraminos (int hauteur , int largeur, double p) {
	// a faire pour 
	} */
	
	
	
