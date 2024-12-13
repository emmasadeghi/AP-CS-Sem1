/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please guess a number between 1-100:");
		int guess = sc.nextInt();
		int answer = 48;
		
		if(guess==answer ){
			System.out.println("You guessed right! Congrats!");
		}
		else{
			System.out.println("You guessed wrong :( Try again.");
		}
		
	}
}
