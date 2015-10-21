import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Drawsome extends JPanel implements MouseMotionListener {
	
	private Point start = null;
	private Point stop = null;
	
	public Drawsome() {
		addMouseMotionListener(this);
		setVisible(true);
	}
	
	@Override
	public void update(Graphics gr) {
		if (start != null && stop != null) {
			gr.setColor(Color.black);
			gr.drawLine(start.x, start.y, stop.x, stop.y);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		start = stop;
		stop = e.getPoint();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		stop = null;
	}
	
}
