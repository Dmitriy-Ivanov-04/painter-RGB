package paint;

import java.awt.Color;
import java.awt.Graphics;

import check.CorrectnessCheck;

public class PaintRGB {
	
	public static CorrectnessCheck check = new CorrectnessCheck();
	
	public void paintRGB(Graphics g, int red, int green, int blue) {
		
		red = check.checkRed(g, red);
		green = check.checkGreen(g, green);
		blue = check.checkBlue(g, blue);
		
		Color redColor = new Color(red, 0, 0);
    	Color greenColor = new Color(0, green, 0);
    	Color blueColor = new Color(0, 0, blue);
    	Color allColor = new Color(red, green, blue);
    	
    	g.drawRect(20, 380, 280, 280);
	   	g.setColor(redColor);
	   	g.fillRect(21, 381, 279, 279);
    	
    	g.drawRect(310, 380, 280, 280);
    	g.setColor(greenColor);
    	g.fillRect(311, 381, 279, 279);
    	
    	g.drawRect(600, 380, 280, 280);
    	g.setColor(blueColor);
    	g.fillRect(601, 381, 279, 279);
    	
    	g.drawRect(20, 60, 860, 280);
    	g.setColor(allColor);
    	g.fillRect(21, 61, 859, 279);
    	g.drawString("RGB(" + red + "," + green + "," + blue + ")", 20, 50);
		
	}

}
