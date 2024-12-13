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
		System.out.println("Please input a number:");
		int x = sc.nextInt();
		System.out.println("Please input a second number:");
		int y = sc.nextInt();
		System.out.println("Please input a third number:");
		int z = sc.nextInt();
		
		if(x>y){
			if(x>z){
				System.out.println(x+" is the largest of those numbers.");
			}
		}
		if(y>x){
			if(y>z){
				System.out.println(y+" is the largest of those numbers.");
			}
		}
		if(z>x){
			if(z>y){
				System.out.println(z+" is the largest of those numbers.");
			}
		}
		
		
		if(x<y){
			if(x<z){
				System.out.println(x+" is the smallest of those numbers.");
			}
		}
		if(y<x){
			if(y<z){
				System.out.println(y+" is the smallest of those numbers.");
			}
		}
		if(z<x){
			if(z<y){
				System.out.println(z+" is the smallest of those numbers.");
			}
		}
	}
}
