package frame;

import java.awt.Graphics;
import javax.swing.JFrame;

import input.DataInput;
import paint.PaintRGB;

public class MyFrame {
	
	public static DataInput di = new DataInput();
	public static PaintRGB paintRGB = new PaintRGB();

	public void myFrame() {
		
		int red = di.dataInputRed();
		int green = di.dataInputGreen();
		int blue = di.dataInputBlue();
		
		new JFrame("RGB Maker") {
			
			private static final long serialVersionUID = 7357390927024756573L;

			{
	            setBounds(30, 0,900,700);
	            setVisible(true);
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
			
			public void paint(Graphics g){ 
		    	super.paint(g);
		    	
		    	paintRGB.paintRGB(g, red, green, blue);
		    	
		    }
			
        };
		
	}
}
