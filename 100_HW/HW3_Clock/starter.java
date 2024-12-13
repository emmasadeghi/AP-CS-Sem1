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
		System.out.println("Please enter the number that corresponds with the current day:");
		System.out.println("0: Sunday");
		System.out.println("1: Monday");
		System.out.println("2: Tuesday");
		System.out.println("3: Wednesday");
		System.out.println("4: Thursday");
		System.out.println("5: Friday");
		System.out.println("6: Saturday");
		int day = sc.nextInt();
		
		if(day==0 || day==6){
			System.out.println("Happy weekend! Wake up! It is 10:00AM!");
		}
		else if(day!=0 || day!=6){
			System.out.println("It's a weekday! Wake up! It is 7:00AM");
		}
	}
}
