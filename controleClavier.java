import java.awt.event.*;

public class controleClavier implements KeyListener{

	public void keyPressed(KeyEvent e) {
		System.out.println("touche pressée"+e.getKeyCode());
				switch (e.getKeyCode()) {
					case KeyEvent.VK_UP:
				
						break;
					case KeyEvent.VK_DOWN:
					
					
						break;
					case KeyEvent.VK_LEFT:
					
						
						

						break;
					case KeyEvent.VK_RIGHT:
						

						break;
					case KeyEvent.VK_SPACE:
					
						break;
					} 
				}
		public void keyReleased(KeyEvent e) {
			
		}
		public void keyTyped(KeyEvent e) {
			
		}



}
