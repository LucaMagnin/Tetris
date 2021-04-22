import java.lang.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class chrono {
	private int heure=0,minute=0,seconde=0;
	//private int heureFin=0, minuteFin=0,secondeFin=0;
	private JPanel panel1;
	private JLabel label1;
	//private JLabel labelFin;
	//private long tempsFin=0;
	private long tempsDepart=0;
	/* Le timer */
		int delais=1000;
		ActionListener tache_timer;
		
	public chrono(){
		

		/* crÃƒÂ©ation des composants */
		label1 = new JLabel(heure+":"+minute+":"+seconde); /* déclarer final car une classe interne va acceder Ãƒ  ce composant */
		panel1 = new JPanel(); //changer ÃƒÂ§a en JPanel
		
	}
		/* Action réalisé par le timer */
	public void start()
	{
		tache_timer= new ActionListener()
		{
			public void actionPerformed(ActionEvent e1)
			{
				seconde++;
				if(seconde==60)
				{
					seconde=0;
					minute++;
				}
				if(minute==60)
				{
					minute=0;
					heure++;
				}
				label1.setText(heure+":"+minute+":"+seconde);/* rafraichir le label */
			}
		};
		
		/* instanciation du timer */
		Timer timer1= new Timer(delais,tache_timer);
		timer1.start();
		tempsDepart=System.currentTimeMillis();
		/* Ajout des composants aux conteneurs avec formatage */
		//label1.setBounds(20,20, 200, 40);
		label1.setBorder(new EmptyBorder (10,20,10,10)); // permet d'eviter d'afficher 0 entre chaque secondes 
		panel1.add(label1);  
		
	}
	public JPanel getPanel(){
		return panel1;
	}
	
	/*public void stop(){
		tempsFin=System.currentTimeMillis()-tempsDepart;
		heureFin=(int) (tempsFin/3600000);
			if (heureFin!=0){
				tempsFin=tempsFin-heureFin*3600000;
			}else{
				heureFin=0;
			}
		minuteFin=(int) (tempsFin/600000);
		
			if (minuteFin!=0){
				tempsFin=tempsFin-minuteFin*60000;
			}else{
				minuteFin=0;
			}
		secondeFin=(int) (tempsFin/1000);
		
		
		heure=0;
		minute=0;
		seconde=0;
		
	} 
	public long getTemps(){
		return tempsFin;
	}
	
	public JLabel getTempsFin(){
		labelFin = new JLabel("" +heureFin+":"+minuteFin+":"+secondeFin);
		return labelFin;
	}*/
}
