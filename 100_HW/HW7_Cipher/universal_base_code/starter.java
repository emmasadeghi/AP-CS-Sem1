/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Cipher apple = new Cipher();
		System.out.println("Does your code have a key? (Y/N)");
		String answer =sc.nextLine();
		if(answer.equals("Y") || answer.equals("y") || answer.equals("yes") || answer.equals("Yes")){
			System.out.println("What would you like to decipher?");
			String code = sc.nextLine();
			System.out.println("What is your key?");
			int key = sc.nextInt();
			System.out.println(apple.keyedEncode(code,key));
		}
		else if(answer.equals("N") || answer.equals("n") || answer.equals("no") || answer.equals("No")){
			System.out.println("What would you like to decipher?");
			String code = sc.nextLine();
			System.out.println(apple.encode(code));
		}

	}
}
