/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a random word");
		String one = sc.nextLine();
		String answer = new String("");
        while(true){
            if(one.indexOf(" ") == -1){
                answer = one + " " + answer;
                break;
            }
            int space = one.indexOf(" ");
            String word = one.substring(0, space);
            
            one = one.substring(space+1);
            answer = word + " " + answer;
            
        }
        System.out.print(answer);
	}
}