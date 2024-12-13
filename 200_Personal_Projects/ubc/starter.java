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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Go Fish!\nYou will be dealt 6 cards.");
		System.out.println("Card values range from 1 to 9");
		System.out.println("Ask your opponent for cards that match the ones in your hand");
		System.out.println("Make 3 pairs to win!");
		System.out.println(" ");
		
		System.out.println("Your cards are:");
		
		int [] bot = new int[6];
		for(int i=0; i<bot.length; i++)
			bot[i] = (int)(Math.random()*10+1);
			
		int [] player = new int[6];
		for(int i=0; i<player.length; i++){
			player[i] = (int)(Math.random()*9+1);
			System.out.println(player[i]);
		}
		/*
		int x1 = 0;
		int x2 = 0;
		int count=0;
		int pairs=0;
		while(count<player.length){
			if(x1 == 6){
				break;
			}
			if(x2 == x1){
			
			}
			else if(player[x1]==player[x2]){
			System.out.println("You have a pair of " + player[x1] + "'s");
			pairs++;
			}
			
			x2++;
			
			if(x2<6){
			x2=0;
			x1++;
			count++;
			}
		*/
		}
		System.out.println(" ");
		
		if(pairs==3){
			System.out.println(" ");
			System.out.println("Lucky Draw! You got three pairs and have won! Play again soon!");
		}
		else{
			while(pairs<3){
			
			System.out.println("What card would you like to ask your opponent for?");
			int guess = sc.nextInt();
			
			for(int i=0; i<bot.length; i++){
				if(bot[i]==guess){
				System.out.println("You now have a pair of " + guess +"'s");
				pairs++;
				}
				/*
				if{
				System.out.println("Your opponent does not have that card, try again:");
				}
				*/
			bot[i] = (int)(Math.random()*10+1);
			}
		}
	}
		
		
		
	}
}