import java.awt.event.*;
	public class EcouteurQuitterGO implements ActionListener{
		private gameOver go;
	
		public EcouteurQuitterGO(gameOver go){
			this.go=go;
		}
	
		public void actionPerformed(ActionEvent e)  {
			go.fermeFen();
			go.fenetreTetris.dispose();
			
 
		} 
	}