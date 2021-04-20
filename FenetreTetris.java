import java.util.LinkedList;
import java.util.TimerTask;
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
	public GrilleC PanneaumaGrille;


		

	
	public FenetreTetris (){   //    LinkedList<Tetraminos> maListeCourbe quand j'aurai la liste de tetraminos 
		
        super(); 
        this.addKeyListener(new controleClavier());
  
        
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
        tetraminosnext1.setBounds(50,0,100,40); // x,y
        tetraminosnext1.setForeground(Color.white);
        tetraminosnext1.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,17));
        
        // Conteneur 2 contient un JLabel consigne
        JLabel tetraminosnext2 = new JLabel();
        tetraminosnext2.setText("NEXT");
        tetraminosnext2.setBounds(50,0,100,40);
        tetraminosnext2.setForeground(Color.white);
        tetraminosnext2.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,17));
        
        // Conteneur 3 contient un JLabel consigne
        JLabel level = new JLabel();
        level.setText("LEVEL");
        level.setBounds(50,0,100,40);
        level.setForeground(Color.white);
        level.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,17));
        
        // Conteneur 4 contient un JTextFiled saisie
        JLabel score = new JLabel();
        score.setText("SCORE");
        score.setBounds(50,0,100,40);
        score.setForeground(Color.white);
        score.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,17));
		
		
		JPanel Conteneur1 = new JPanel() ;
        Conteneur1.setLayout(null);
        Conteneur1.setBounds(250,25,170,170);
        Conteneur1.setBackground(new Color(32,74,200));
        Conteneur1.add(tetraminosnext1);
		
		JPanel Conteneur2 = new JPanel() ;
        Conteneur2.setLayout(null);
        Conteneur2.setBounds(900,25,170,170);
        Conteneur2.setBackground(new Color(32,74,200));
        Conteneur2.add(tetraminosnext2);
        
        JPanel Conteneur3 = new JPanel() ;
        Conteneur3.setLayout(null);
        Conteneur3.setBounds(250,520,170,150);
        Conteneur3.setBackground(new Color(32,74,200));
        Conteneur3.add(level);
		
		JPanel Conteneur4 = new JPanel() ;
        Conteneur4.setLayout(null);
        Conteneur4.setBounds(900,520,170,150);
        Conteneur4.setBackground(new Color(32,74,200));
        Conteneur4.add(score);
        
        panneauGeneral.add(Conteneur1);
        panneauGeneral.add(Conteneur2);
        panneauGeneral.add(Conteneur3);
        panneauGeneral.add(Conteneur4); 
             
        
        //panneau fond
	JLabel Fond1 = new JLabel(new ImageIcon("./Tetris-blockst.png"));
	Fond1.setBounds(-10,0,1300,650);
	
	panneauGeneral.add(Fond1);	
	
	//ajout panneau Grille
        
       PanneaumaGrille = new GrilleC();
       PanneaumaGrille.setLayout(null);
       PanneaumaGrille.setBounds(0,0,1285,675);
       panneauGeneral.add(PanneaumaGrille);
       this.setVisible(true);
       

	}

	public class controleClavier implements KeyListener{
		public void keyPressed(KeyEvent e) {
		
		
				switch (e.getKeyCode()) {
					case KeyEvent.VK_UP:
				
						break;
					case KeyEvent.VK_DOWN:
						PanneaumaGrille.monControleGrille.Descendre();
					
						break;
					case KeyEvent.VK_LEFT:
					
						PanneaumaGrille.monControleGrille.DeplacementAGauche();

						break;
					case KeyEvent.VK_RIGHT:
						PanneaumaGrille.monControleGrille.DeplacementADroite();

						break;
					case KeyEvent.VK_SPACE:
						PanneaumaGrille.monControleGrille.Rotation();
					
						break;
					} 
				}
			public void keyReleased(KeyEvent e) {
			
			}
			public void keyTyped(KeyEvent e) {
			
			}



	}

}
        
        

        

	
	
	
