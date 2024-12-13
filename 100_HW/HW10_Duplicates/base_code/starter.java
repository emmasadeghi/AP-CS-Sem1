/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] array = new int [20];
		int a = (int)(Math.random() * 10) + 1;
		int b = 0;
		System.out.println("Your random number is " + a);
		for(int d = 0; d < 20; d++){
			array[d] = (int)(Math.random() * 10) + 1;
			if(array[d] == a){
				System.out.println("Duplicate in index number " + d);
				b++;
			}
		}
		System.out.println("There are " + b + " duplicates of the number " + a);
		for(int d = 1; d < 20; d++){
			int c = d - 1;
			if(array[d] == array[c]){
				System.out.println("There are two in a row at index " + d + " and " + c + ". Your number is " + array[d]);
			}
		}
	}
}
