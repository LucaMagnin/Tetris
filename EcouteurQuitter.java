import java.awt.event.*;
import java.util.*;


public class EcouteurQuitter implements ActionListener{
	private Interfacedepart dep;
	
	public EcouteurQuitter(Interfacedepart dep){
		this.dep=dep;
	}
	
	public void actionPerformed(ActionEvent e)  {
		dep.fermeFen();
 
	} 
}
