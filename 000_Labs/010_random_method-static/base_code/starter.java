/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		int w = (int)Math.random()*9;
		int x = (int)(Math.random()*99)+1;
		double y = Math.random()+2.5;
		int z = (int)(Math.random()*575)+14;
		
		System.out.println(w+", "+x+", "+y+", "+z);
	}
}
