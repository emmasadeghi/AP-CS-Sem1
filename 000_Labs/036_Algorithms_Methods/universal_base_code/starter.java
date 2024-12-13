/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		int [] array = new int[100];
		
		for(int i=0; i<array.length; i++){
			array[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(array.toStringArray());
		System.out.println(array.getArrayMax);
		System.out.println(array.getArrayMin);
	}
}
