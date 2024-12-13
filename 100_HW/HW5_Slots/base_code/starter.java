/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

	import java.util.Scanner;

	class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		int a;
		int b;
		int c;
		System.out.println("Slot Machine Rules:");
		System.out.println("	1. Each player starts with $100.");
		System.out.println("	2. Input a wager less than your total amount of money.");
		System.out.println("	3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
		while(true){
			System.out.print("Would you like to play slots? (yes/Yes/Y/y): ");
			String answer = sc.nextLine();
			if(answer.equals("Yes") ||  answer.equals("yes") || answer.equals("Y") || answer.equals("y")){	
				System.out.print("You have $" +money+". How much would you like to wager? ");
				int wager = sc.nextInt();
				while(true){
					if(wager > money){
						System.out.print("You only have $"+money+". Enter a smaller wager: ");
						wager = sc.nextInt();
					}
					else if(wager <= 0){
						System.out.println("Wager cannot be 0 or negative. You have $"+money+". Enter a larger wager: ");
						wager = sc.nextInt();
					}
					else{
						break;
					}
				}
				a = (int)(Math.random() * 9) + 1;
				b = (int)(Math.random() * 9) + 1;
				c = (int)(Math.random() * 9) + 1;
				System.out.println("Lets Play!");
				System.out.println("Your rolls are: ");
				System.out.println("_______________________");
				System.out.println(" | "+a+" | "+b+" | "+c+" |");
				System.out.println("_______________________");
				if(a==b){
					if(b==c){
						money = money-wager+(wager*3);
						System.out.println("JACKPOT! Your money ahs been tripled!");
						System.out.println("You have $"+money);
						System.out.println(" ");
					}
					else{
						money = money-wager+(wager*2);
						System.out.println("Winner! Your money has been doubled!");
						System.out.println("You have $"+money);
						System.out.println(" ");
					}
				}
				else if(a==c){
					money = money-wager+(wager*2);
					System.out.println("Winner! Your money has been doubled!");
					System.out.println("You have $"+money);
					System.out.println(" ");
				}
				else if(b==c){
					money = money-wager+(wager*2);
					System.out.println("Winner! Your money has been doubled!");
					System.out.println("You have $"+money);
					System.out.println(" ");
				}
				else{
					money = money-wager;
					System.out.println("You didn't win :(");
					System.out.println("You have $"+money);
					System.out.println(" ");
				}
				
				if(money==0){
				System.out.println("Looks like you're out of money :( Come back soon");
				}
			}
			else if(answer.equals("No") ||  answer.equals("no") || answer.equals("N") || answer.equals("n")){
				System.out.println("See you soon! You ended with " + money + "$");
				break;
			}
		}
	}
}