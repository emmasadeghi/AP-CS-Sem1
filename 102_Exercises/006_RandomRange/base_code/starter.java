/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number:");
        int x = sc.nextInt();
        System.out.println("Please input another number (larger than the previous):");
        int y = sc.nextInt();
        
       System.out.println("Your range is "+x+" to "+y);
       System.out.println("Here are five numbers in that range:");
       System.out.print((int)(Math.random()*(y-x))+x+", ");
       System.out.print((int)(Math.random()*(y-x))+x+", ");
       System.out.print((int)(Math.random()*(y-x))+x+", ");
       System.out.print((int)(Math.random()*(y-x))+x+", ");
       System.out.print((int)(Math.random()*(y-x))+x);
	}
}
