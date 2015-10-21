import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	public MainWindow (String title, int width, int height) {
		Drawsome dPanel = new Drawsome();
		
		setTitle(title);
		setBackground(Color.gray);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width, height);
		setVisible(true);
		add(dPanel);
	}
	
}
