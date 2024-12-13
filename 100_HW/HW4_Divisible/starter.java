/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = sc.nextInt();
		if(x%2==0){
			System.out.println("That is an even number");
		}
		else if(x%2==1){
			System.out.println("That is an odd number");
		}
		
		if(x%3==0)
			if(x%4==0)
				if(x%5==0){
					System.out.println(x+" is divisible by 3, 4, and 5!");
				}
		else{
			System.out.println(x+" is not divisble by 3, 4, and 5.");
		}
	
	
	
	
		System.out.println("Please enter another number");
		int y = sc.nextInt();
		if(y%2==0){
			System.out.println("That is an even number");
		}
		else if(y%2==1){
			System.out.println("That is an odd number");
		}
		
		if(y%3==0)
			if(y%4==0)
				if(y%5==0){
					System.out.println(y+" is divisible by 3, 4, and 5!");
				}
		else{
			System.out.println(y+" is not divisble by 3, 4, and 5.");
		}
	}
}
