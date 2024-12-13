/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Hello "+name+", how many times should I print out your name?");
	int c = sc.nextInt();
	while(c>=1){
		System.out.println(name);
		c=c-1;
	}

	}
}

