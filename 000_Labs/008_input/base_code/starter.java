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
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        
        System.out.println("How old are you?");
        int age = sc.nextInt();
        
        System.out.println("What month were you born?");
        String month = sc.nextLine();
        
        System.out.println("What date were you born on?");
        int date = sc.nextInt();
        
        System.out.println("What year were you born?");
        int year = sc.nextInt();
        
        System.out.println("How much is a buck fifty?");
        String buck = sc.nextLine();
	}
}
