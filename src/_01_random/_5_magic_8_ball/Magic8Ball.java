//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
	// 2. Get the user to enter a question for the 8 ball to answer
	String question = JOptionPane.showInputDialog("enter a question for the holy 8 ball");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random ran = new Random();
	int number = ran.nextInt(4);
	// 4. If the random number is 0
	if(number==0) {
		JOptionPane.showMessageDialog(null, "yes");
	}
	// -- tell the user "Yes"

	// 5. If the random number is 1
	else if(number==1) {
		JOptionPane.showMessageDialog(null, "no");
	}
	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
	else if(number==2) {
		JOptionPane.showMessageDialog(null, "ask google");
	}
	// 7. If the random number is 3
	else {
		JOptionPane.showMessageDialog(null, "ask again");
	}
	// -- write your own answer
	}

}
