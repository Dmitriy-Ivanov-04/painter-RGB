package check;

import java.awt.Graphics;

public class CorrectnessCheck {
	
	public int checkRed(Graphics g, int red) {
		
		if (red == -1) {
			red = 0;
			g.drawString("R = " + "Value is invalid", 130, 680);
			
			return red;
		} else {
			g.drawString("R = " + red, 130, 680);
			
			return red;
		}
		
	}
	
	public int checkGreen(Graphics g, int green) {
		
		if (green == -1) {
			green = 0;
			g.drawString("G = " + "Value is invalid", 420, 680);
			
			return green;
		} else {
	    	g.drawString("G = " + green, 420, 680);
			
			return green;
		}
		
	}
	
	public int checkBlue(Graphics g, int blue) {
		
		if (blue == -1) {
			blue = 0;
			g.drawString("B = " + "Value is invalid", 710, 680);
			
			return blue;
		} else {
			g.drawString("B = " + blue, 710, 680);
			
			return blue;
		}
		
	}

}
