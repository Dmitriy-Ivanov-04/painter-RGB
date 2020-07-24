package input;

import javax.swing.JOptionPane;

public class DataInput {
	
	public int dataInputRed() {
		
		int red = Integer.parseInt(JOptionPane.showInputDialog("Enter red value [0-255]"));
		if(red < 0 || red > 255) {
			red = -1; //Value is invalid
		}
		
		return red;
	}
	
	public int dataInputGreen() {
		
		int green = Integer.parseInt(JOptionPane.showInputDialog("Enter green value [0-255]"));
		if(green < 0 || green > 255) {
			green = -1; //Value is invalid
		}
		
		return green;
	}
	
	public int dataInputBlue() {
		
		int blue = Integer.parseInt(JOptionPane.showInputDialog("Enter blue value [0-255]"));
		if(blue < 0 || blue > 255) {
			blue = -1; //Value is invalidS
		}
		
		return blue;
	}
	

}
