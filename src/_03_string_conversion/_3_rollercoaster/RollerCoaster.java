package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
			
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
			String heightToRide=JOptionPane.showInputDialog("enter ur height in inches please and thank you");
		// Uncomment the line below...
			int heightAsInt=Integer.parseInt(heightToRide);
			if( heightAsInt > 42 ) { }
		
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
		
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
			if(heightAsInt>=48) {
				JOptionPane.showMessageDialog(null, "yippee, you can ride alone :|");
			}
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
			else if(heightAsInt>=42) {
				JOptionPane.showMessageDialog(null, "you can ride, huzzah. But, only with someone else. Mwah ha ha ha ha");
			}
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
			else {
				JOptionPane.showMessageDialog(null, "u cannot ride this coaster. so get out of here short wimp");
			}
		}
} 
