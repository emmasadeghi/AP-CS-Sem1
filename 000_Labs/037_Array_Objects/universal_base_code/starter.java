/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int wan = 0;
		int win = 0;
		Warrior[] war = new Warrior[100];
		Wizard[] wiz = new Wizard[100];
		for(int i = 0; i < 100; i++){
			war[i] = new Warrior();
			wiz[i] = new Wizard();
		}
		while(true){
			if(wan > 99){
				int a = 100 - win;
				System.out.println("The wizards won with " + a + " left in their army");
				break;
			}
			if(win > 99){
				int b = 100 - wan;
				System.out.println("The wizards won with " + b + " left in their army");
				break;
			}
			wiz[win].attack(war[wan]);
			war[wan].attack(wiz[win]);
			if(war[wan].isDead()){
				wan++;
			}
			if(wiz[win].isDead()){
				win++;
			}
		}
	}
}