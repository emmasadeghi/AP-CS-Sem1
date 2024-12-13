/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input a number:");
        int no = sc.nextInt();
        System.out.println("Here are the next five numbers:");
        System.out.println((no+1)+", "+(no+2)+", "+(no+3)+", "+(no+4)+", "+(no+5));
		
		System.out.println("Here are the next five multiples of " + no + ":");
        System.out.println((no*1)+", "+(no*2)+", "+(no*3)+", "+(no*4)+", "+(no*5));
        
        System.out.println("Here is "+no+" divided by 100:");
        System.out.println(no/100.0);
        
        System.out.println("Here is "+no+" divided by 10:");
        System.out.println(no/10.0);

	}
}
