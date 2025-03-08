package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num1 = ran.nextInt(100)+1;
		int num2 = ran.nextInt(100)+1;
		int num3 = ran.nextInt(100)+1;
		int num4 = ran.nextInt(100)+1;
		int num5 = ran.nextInt(100)+1;
		int num6 = ran.nextInt(100)+1;

		JOptionPane.showMessageDialog(null, num1 + " " + num2 + " "+ num3 + " "+ num4+ " "+ num5 + " "+ num6);
	}

}
