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
        myCharacter empty = new myCharacter();
        System.out.println("You have " +  empty.getRole());
        System.out.println("Strength: " + empty.Strength);
        System.out.println("Dexterity: " + empty.Dexterity);
        System.out.println("Intelligence: " + empty.Intelligence);
        System.out.println("Constitution: " + empty.Constitution);
        System.out.println("Charisma: " + empty.Charisma);
        System.out.println("------------------------------------------------");
        System.out.println("Choose your characters role!");
        String role = sc.nextLine();
        myCharacter stats = new myCharacter(role);
        String get = stats.getRole();
        if(get.equals("no role")){
            System.out.println("You didnt chose a role, rerun program");
            System.out.println("You have " + get);
            System.out.println("Strength: " + stats.Strength);
    		System.out.println("Dexterity: " + stats.Dexterity);
    	    System.out.println("Intelligence: " + stats.Intelligence);
    	    System.out.println("Constitution: " + stats.Constitution);
    	    System.out.println("Charisma: " + stats.Charisma);
        }
        else{
            System.out.println("You're a " + get);
            System.out.println("Strength: " + stats.Strength);
    		System.out.println("Dexterity: " + stats.Dexterity);
    	    System.out.println("Intelligence: " + stats.Intelligence);
    	    System.out.println("Constitution: " + stats.Constitution);
    	    System.out.println("Charisma: " + stats.Charisma);
        }
    }
}
