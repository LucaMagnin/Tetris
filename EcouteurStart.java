import java.awt.event.*;
import java.util.*;


public class EcouteurStart implements ActionListener{
	private Interfacedepart dep;
	
	public EcouteurStart(Interfacedepart dep){
		this.dep=dep;
	}
	
	public void actionPerformed(ActionEvent e)  {

		FenetreTetris f =new FenetreTetris(dep);
		dep.fermeFen();
 
	} 
}
