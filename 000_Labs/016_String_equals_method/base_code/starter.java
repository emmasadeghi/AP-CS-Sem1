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
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		
		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You're a wizard, Harry!");
		}
		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("A Warrior! How mighty!");
		}
		else if(role.equals("Rogue") || role.equals("rogue")){
			System.out.println("A Rogue?! Defying the resistance I see!");
		}
		else{
			System.out.println("None of those? Okay, maybe next time.");
		}
	}
}
