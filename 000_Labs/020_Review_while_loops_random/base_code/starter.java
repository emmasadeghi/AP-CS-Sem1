/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int secret = 443;
	while(true){
		System.out.println("Guess a number between 1 and 1000:");
		int guess = sc.nextInt();
			if(guess>secret){
				System.out.println("Too high!");
				System.out.println(" ");
			}
			else if(guess<secret){
				System.out.println("Too low!");
				System.out.println(" ");
			}
		
			if(secret==guess){
			System.out.println("You got it!");
			break;
			}
		}
		
	}
}
