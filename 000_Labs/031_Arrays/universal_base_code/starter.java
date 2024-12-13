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
		
		int [] array = new int[10];
		int a=0;
		while(a<array.length){
			array[a]=(9-a);
			System.out.println("Index:"+a+" Value:"+array[a]);
			a++;
			
		}


		
	}
}
