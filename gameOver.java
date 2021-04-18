import javax.swing.*;
import java.awt.*;
public class gameOver extends JFrame{
	
	public gameOver(){
		setTitle("Game Over"); 
        setSize(500,500);	
        setLocation(100,200);
	// Pour placer la fenÃªtre au centre de l'Ã©cran
		this.setLocationRelativeTo(null);
        
        JLabel perdu = new JLabel("GAME OVER");
        perdu.setBounds(180,70,300,100);
        perdu.setForeground(Color.blue);
        //panneau fond
		JLabel Fond = new JLabel(new ImageIcon("./Rf838b0264611378bc84338f70571ed1c.png"));
		Fond.setBounds(0,0,this.getWidth(),this.getHeight());
        
        perdu.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,40));
        
        JPanel panneauFinal = new JPanel(); 
		panneauFinal.setLayout(null);
		panneauFinal.add(perdu); 
		panneauFinal.setBounds(100,200,500,500);
		
		panneauFinal.add(Fond);
		add(panneauFinal);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

