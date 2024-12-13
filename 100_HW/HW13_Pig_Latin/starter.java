/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.*;
class starter {
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a sentance");
		String sentence = sc.nextLine();
		String newSentence = (" ");
		while(true){
			if(sentence.indexOf(" ") ==-1){
				sentence = toPigLatin(sentence);
				newSentence = newSentence+sentence;
				break;
			}
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0, space);
		sentence = sentence.substring(space+1);
		word = toPigLatin(word);
		newSentence = newSentence + word + " ";
		}
		System.out.println(newSentence);
	}
	
	public static String toPigLatin(String a){
		String line1 = (a.substring(0,1));
		if(a.length() > 1){
			String line2 = (a.substring(1,2)); 
			if(!isVowel(line1)&&!isVowel(line2)){
				a = a.substring(2) + "-" + a.substring(0,2) + "ay";
			}
			else if(isVowel(line1)){
				a = a+"-way";
			}
			else{
				a = a.substring(1) + "-" + a.substring(0,1) + "ay";
			}
			return a;
		}
		else{
			if(isVowel(line1)){
				a = a+"-way";
			}
			else{
				a = a.substring(1) + "-" + a.substring(0,1) + "ay";
			}
			return a;
		}
	}
	
	public static boolean isVowel(String vowel){
		if(vowel.equals("A")||vowel.equals("a")||vowel.equals("E")||vowel.equals("e")||vowel.equals("I")||vowel.equals("i")||vowel.equals("O")||vowel.equals("o")||vowel.equals("U")||vowel.equals("u")){
			return true;
		}
		else{
			return false;
		}
	}
	
}
