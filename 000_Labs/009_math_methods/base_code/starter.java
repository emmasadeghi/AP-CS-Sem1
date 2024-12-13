/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		int a1 = (13-6*11);
		int a2 = 30%7*(-2);
		
		System.out.println("A: "+Math.max(a1, a2));
		
		int b = (3*8+31%7);
		
		System.out.println("B: "+Math.sqrt(b));
		
		int c1 = (37/3);
		int c2 = (35%21);
		
		System.out.println("C: "+Math.pow(c1,c2));
		
		int d1 = 2;
		int d2 = (14%3);
		int d3 = (2*6);
		double d4 = Math.pow(d1,d2);
		double d5 = Math.sqrt(d3);
		
		System.out.println("D: "+Math.max(d4,d5));
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number (X):");
        int x = sc.nextInt();
        System.out.println("Please enter another number (Y):");
		int y = sc.nextInt();
		
		System.out.println("The max of those nmbers is: "+ Math.max(x,y));
		System.out.println("The square root of Y is: "+ Math.sqrt(y));
		System.out.println("X to the power of Y is: " + Math.pow(x,y));
	}
}
