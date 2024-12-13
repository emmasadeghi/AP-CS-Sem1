/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;
import java.util.Random;

class Character{
    String role = "Wizard";
    int strength = 9;
    int dexterity = 4;
    int intelligence = 2;
    int charisma = 1;

}

class starter {
    public static void main(String args[]) {
        Character mychar = new Character();
        System.out.println("You're a " + mychar.role);
        System.out.println("Strength: "+mychar.strength);
        System.out.println("Dexterity: "+mychar.dexterity);
        System.out.println("Intelligence: "+mychar.intelligence);
        System.out.println("Charisma: "+mychar.charisma);
    }
}