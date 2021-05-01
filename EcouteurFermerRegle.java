import java.awt.event.*;
public class EcouteurFermerRegle implements ActionListener{
		private Regle reg;
	
		public EcouteurFermerRegle(Regle reg){
			this.reg=reg;
		}
	
		public void actionPerformed(ActionEvent e)  {
			reg.fermeFen();
 
		} 
	}
