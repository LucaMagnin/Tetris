import java.awt.event.*;
	public class EcouteurMenuGO implements ActionListener{
		private gameOver go;
	
		public EcouteurMenuGO(gameOver go){
			this.go=go;
		}
	
		public void actionPerformed(ActionEvent e)  {
			new Interfacedepart();
			go.fermeFen();
 
		} 
	}