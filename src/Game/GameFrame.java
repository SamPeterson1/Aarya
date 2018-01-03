package Game;

import javax.swing.JPanel;

public class GameFrame extends JPanel{
	public GameFrame() {
		super();
		setFocusable(true);	
		addKeyListener(new Listener());
	}
}
