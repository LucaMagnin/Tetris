import java.util.LinkedList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class FenetreTetris extends GrilleC { //implements ActionListener 
	
	private JFrame Tetris = new JFrame();
	
	public static void main (String[] args) {
		JFrame Tetris = new JFrame();
		Tetris.setVisible(true);
   }
   
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
		

	
	public FenetreTetris (GrilleC Grille){   //    LinkedList<Tetraminos> maListeCourbe quand j'aurai la liste de tetraminos 
		super(Grille); 
		//JFrame Tetris = new JFrame ();
		JPanel PanneaumaGrille = new JPanel ();
       
 
        Tetris.setTitle("TETRIS GAME ");
        Tetris.setSize(800,600);
        // Pour placer la fenetre au centre de l'ecran
		Tetris.setLocationRelativeTo(null);
		//Pour empecher le redimensionnement de la fenetre
		Tetris.setResizable(false);
		// Pour permettre la fermeture de la fenetre lors de l'appui sur la croix rouge
		Tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// mon panneau global
		/*JPanel panneauGeneral = new JPanel();
		panneauGeneral.setBounds(0,0,this.getWidth(),this.getHeight());
		panneauGeneral.setLayout(null);
		Tetris.add(panneauGeneral);*/
		
		
		 // Conteneur 1 contient un JLabel consigne
        JLabel tetraminosnext1 = new JLabel();
        tetraminosnext1.setText("HOLD");
        tetraminosnext1.setBounds(0,0,60,10); // x,y
        
        // Conteneur 2 contient un JLabel consigne
        JLabel tetraminosnext2 = new JLabel();
        tetraminosnext2.setText("NEXT");
        tetraminosnext2.setBounds(0,0,60,10);
        
        // Conteneur 3 contient un JLabel consigne
        JLabel level = new JLabel();
        level.setText("LEVEL");
        level.setBounds(0,0,60,10);
        level.setForeground(Color.white);
        
        // Conteneur 4 contient un JTextFiled saisie
        JLabel score = new JLabel();
        score.setText("SCORE");
        score.setBounds(0,0,60,7);
		
		
		JPanel Conteneur1 = new JPanel() ;
        Conteneur1.setLayout(null);
        Conteneur1.setBounds(80,10,60,40);
        Conteneur1.setBackground(new Color(21,47,128));
        Conteneur1.add(tetraminosnext1);
		
		JPanel Conteneur2 = new JPanel() ;
        Conteneur2.setLayout(null);
        Conteneur2.setBounds(260,10,60,40);
        Conteneur2.setBackground(new Color(21,47,128));
        Conteneur2.add(tetraminosnext2);
        
        JPanel Conteneur3 = new JPanel() ;
        Conteneur3.setLayout(null);
        Conteneur3.setBounds(80,160,60,50);
        Conteneur3.setBackground(new Color(32,74,200));
        Conteneur3.add(level);
		
		JPanel Conteneur4 = new JPanel() ;
        Conteneur4.setLayout(null);
        Conteneur4.setBounds(260,160,60,30);
        Conteneur4.setBackground(new Color(32,74,200));
        Conteneur4.add(score);
        
        Tetris.add(Conteneur1);
        Tetris.add(Conteneur2);
        Tetris.add(Conteneur3);
        Tetris.add(Conteneur4); 
        
        //ajout panneau Grille
        PanneaumaGrille.setLayout(null);
        PanneaumaGrille.setBounds(100,160,60,30);
        Tetris.add(PanneaumaGrille);
        
        this.setVisible(true);
        }
        
 }
        
        /*JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(10, // nb de cases dans une ligne
      20, // nb de cases dans une colonne
      1, // épaisseur des traits horizontaux
      1)); // épaisseur des traits verticaux
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
	
	
	
