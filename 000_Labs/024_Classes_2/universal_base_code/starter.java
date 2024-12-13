/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        myCharacter mychar = new myCharacter();
        System.out.println("You're a " + mychar.role);
        System.out.println("Strength: "+mychar.strength);
        System.out.println("Dexterity: "+mychar.dexterity);
        System.out.println("Intelligence: "+mychar.intelligence);
        System.out.println("Charisma: "+mychar.charisma);
    }
}
