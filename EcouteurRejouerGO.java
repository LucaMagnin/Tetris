import java.awt.event.*;

public class EcouteurRejouerGO implements ActionListener{
		private gameOver go;
	
		public EcouteurRejouerGO(gameOver go){
			this.go=go;
		}
	
		public void actionPerformed(ActionEvent e)  {
			go.fermeFen();
			FenetreTetris f =new FenetreTetris();
		}
		
	}	