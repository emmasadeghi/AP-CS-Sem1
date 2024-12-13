/*
 *Author:  
 *  Date: 
*/

import pkg.*;
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
// Your code goes below here
	Scanner sc = new Scanner(System.in);
	myCharacter lol = new myCharacter();
	
	System.out.println("What is  your Role");
	String role = sc.nextLine();
	lol.setRole(role);
	System.out.println("What is your dexterity?");
	int dex = sc.nextInt();
	lol.setDexterity(dex);
	System.out.println("What is your charisma?");
	int cha= sc.nextInt();
	lol.setCharisma(cha);
	System.out.println("What is your intelegence?");
	int intel = sc.nextInt();
	lol.setInteligence(intel);
	System.out.println("What is your strength?");
	int stren = sc.nextInt();
	
	lol.setStrength(stren);
	lol.setAll(role,dex,cha,intel,stren);
	lol.myToString();
	
	
	}
}