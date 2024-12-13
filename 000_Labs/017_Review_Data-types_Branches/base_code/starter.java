/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello stranger, what's your name?");
		String name = sc.nextLine();
		System.out.println("Hello "+name+", would you like to be a wizard, warrior, or rogue?");
		
		String role = sc.nextLine();
		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You're a wizard, Harry!");
		}
		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("A Warrior! How mighty!");
		}
		else if(role.equals("Rogue") || role.equals("rogue")){
			System.out.println("A Rogue?! Defying the resistance I see!");
		}
		else{
			System.out.println("None of those? Okay, maybe next time.");
		}
		
		System.out.println("You may now purchase traits for your character!");
		System.out.println("Each of the following traits is 10 points. You currently have 20 points total to spend!");
		System.out.println("1. Strength - Buff and able to carry larger items!");
		System.out.println("2. Dexterity - Agile and moves quick!");
		System.out.println("3. Intelligence - Better at magic spells!");
		System.out.println("4. Charisma - How personable!");
		System.out.println("Type the name of the trait you'd like to purchase for 10 points");

		String uno =sc.nextLine();
		if(uno.equals("Strength") || uno.equals("strength")){
			System.out.println("Wow! You're so strong!");
			System.out.println("You have 10 points left, would you like to purchase another trait?");
			System.out.println("If so, enter the name of the trait you'd like to purchase.");
			String dos = sc.nextLine();
					if(dos.equals("Strength") || dos.equals("strength")){
						System.out.println("Wow! You're so strong!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Dexterity") || dos.equals("dexterity")){
						System.out.println("Wow! You're so speedy!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Intelligence") || dos.equals("intelligence")){
						System.out.println("Wow! You're so smart!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Charisma") || dos.equals("charisma")){
						System.out.println("Wow! You're so funny!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
						
					}
					else{
						System.out.println("No more traits? Okay, well then our journey come to an end");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
		}
		
		
		else if(uno.equals("Dexterity") || uno.equals("dexterity")){
			System.out.println("Wow! You're so speedy!");
			System.out.println("You have 10 points left, would you like to purchase another trait?");
			System.out.println("If so, enter the name of the trait you'd like to purchase.");
			String dos = sc.nextLine();
					if(dos.equals("Strength") || dos.equals("strength")){
						System.out.println("Wow! You're so strong!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Dexterity") || dos.equals("dexterity")){
						System.out.println("Wow! You're so speedy!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Intelligence") || dos.equals("intelligence")){
						System.out.println("Wow! You're so smart!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Charisma") || dos.equals("charisma")){
						System.out.println("Wow! You're so funny!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
						
					}
					else{
						System.out.println("No more traits? Okay, well then our journey come to an end");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
		}
		
		
		else if(uno.equals("Intelligence") || uno.equals("intelligence")){
			System.out.println("Wow! You're so smart!");
			System.out.println("You have 10 points left, would you like to purchase another trait?");
			System.out.println("If so, enter the name of the trait you'd like to purchase.");
			String dos = sc.nextLine();
					if(dos.equals("Strength") || dos.equals("strength")){
						System.out.println("Wow! You're so strong!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Dexterity") || dos.equals("dexterity")){
						System.out.println("Wow! You're so speedy!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Intelligence") || dos.equals("intelligence")){
						System.out.println("Wow! You're so smart!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Charisma") || dos.equals("charisma")){
						System.out.println("Wow! You're so funny!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
						
					}
					else{
						System.out.println("No more traits? Okay, well then our journey come to an end");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
		}
		
		
		else if(uno.equals("Charisma") || uno.equals("charisma")){
			System.out.println("Wow! You're so funny!");
			System.out.println("You have 10 points left, would you like to purchase another trait?");
			System.out.println("If so, enter the name of the trait you'd like to purchase.");
			String dos = sc.nextLine();
					if(dos.equals("Strength") || dos.equals("strength")){
						System.out.println("Wow! You're so strong!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Dexterity") || dos.equals("dexterity")){
						System.out.println("Wow! You're so speedy!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Intelligence") || dos.equals("intelligence")){
						System.out.println("Wow! You're so smart!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
					else if(dos.equals("Charisma") || dos.equals("charisma")){
						System.out.println("Wow! You're so funny!");
						System.out.println("You have no more points! I guess this is the end of our journey. :(");
						System.out.println("I'll see you next time "+name+" the "+role);
						
					}
					else{
						System.out.println("No more traits? Okay, well then our journey come to an end");
						System.out.println("I'll see you next time "+name+" the "+role);
					}
			
		}
		
		
		else{
			System.out.println("None of those? Okay, well then our journey come to an end");
			System.out.println("I'll see you next time "+name+" the "+role);
		}	
	}
}