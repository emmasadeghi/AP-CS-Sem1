/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog maxine = new Dog("Maxine");
		maxine.setAge(4);
		maxine.dogToString();

		Dog bingus = new Dog("Bingus", "Greyhound");
		bingus.dogToString();
		
		maxine.isSleeping();
			if(maxine.isSleeping()==true){
				maxine.bark();
				bingus.bark();
			}
			else{
			System.out.println("Maxine is asleep");
			}
		
		bingus.isSleeping();
		
	}
}
