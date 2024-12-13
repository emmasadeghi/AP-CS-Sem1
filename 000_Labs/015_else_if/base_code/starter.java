/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please guess a number between 1-1000:");
		int guess = sc.nextInt();
		int answer = 821;
		
		if(guess==answer ){
			System.out.println("You guessed right! Congrats!");
		}
		if(guess>answer){
			System.out.println("Your guess it too high! Try again.");
		}
		if(guess<answer){
			System.out.println("Your guess it too low! Try again.");
		}
		
	}
}
