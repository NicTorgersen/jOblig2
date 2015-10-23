import java.awt.Color;


public class Tegneprogram {
	
	public static void main(String[] args) {
		String windowTitle = "Obligatorisk Oppgave 1: Swing";
		int height = 800;
		int width = 600;
		Color drawColor = Color.black;
		
		new MainWindow(windowTitle, width, height, drawColor);
	}
	
}
