package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == 'a') {
				System.out.println("IT WORKED!!!!(-:}");
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}
}
