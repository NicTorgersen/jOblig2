import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Drawsome extends JPanel implements MouseMotionListener {
	
	private Point start = null;
	private Point stop = null;
	private Color drawColor = null;
	
	public Drawsome(Color drawColor) {
		drawColor = drawColor;
		addMouseMotionListener(this);
		setVisible(true);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		start = stop;
		stop = new Point(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		stop = null;
	}
	
	public void paintComponent(Graphics gr) {
		gr.setColor(drawColor);
		if (start != null && stop != null) {
			gr.drawLine(start.x, start.y, stop.x, stop.y);
		}
	}
	
}
