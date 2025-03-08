//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		int randomNumber;
		
		
		//System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for(int i=1; i<=10;i++) {
			randomNumber = randomMaker.nextInt(5);
			if(randomNumber==0) {
				System.out.println("you are good at something");
			}
			else if(randomNumber==1) {
				System.out.println("you are good at something else");
			}
			else if(randomNumber==2) {
				System.out.println("you are good at math");
			}
			else if(randomNumber==3) {
				System.out.println("you are tall");
			}
			else if(randomNumber==4) {
				System.out.println("you are good at sleeping");
			}
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
