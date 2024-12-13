/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = sc.nextLine();
		
	
		int i = 0;
		while(i<word.length()){
			if(i%2==0){
				String low = word.substring(i,i+1);
				System.out.print(low.toLowerCase());
				i++;
			}
			else{
					String upp = word.substring(i,i+1);
					System.out.print(upp.toUpperCase());
					i++;
			}
		}
	}
}
