/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		String [] array = new String[10];
		array[0]="I";
		array[1]="like";
		array[2]="gliter";
		array[3]="and";
		array[4]="sparkly";
		array[5]="dresses";
		array[6]="but I'm not";
		array[7]="going to talk";
		array[8]="about that";
		array[9]="in my monolouge!";
		
		int i=0;
		while(i<array.length){
			System.out.println(array[i]);
			i++;
		}

		
	}
}
