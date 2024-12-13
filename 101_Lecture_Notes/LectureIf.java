/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("You are getting ready for school!");
       System.out.println("What would you like to eat for breakfast?");
        System.out.println("1. Avocado Toast");
        System.out.println("2. Yogrut Parfait");
        System.out.println("3.Oatmeal Bowl");
        
       int breakfast = sc.nextInt();
       if(breakfast==1){
          System.out.println("Exquisite!");
       }
       else if (breakfast==2){
           System.out.println("Interesting.");
       }
       else if(breakfast==3){
           System.out.println("Hmm.. Kinda boring, but ok..");
       }
       else{
           
       }
       
       System.out.println("Now what are you wearing to school?");
       System.out.println("1. A t-shirt and jeans");
       System.out.println("2. Hot pink floor length dress");
       System.out.println("3. A navy blue sweatseat");
       
       int outfit = sc.nextInt();
       if(outfit==1){
          System.out.println("Okay, simple and effective!");
       }
       else if (outfit==2){
           System.out.println("A little extra, but sure..");
       }
       else if(outfit==3){
           System.out.println("Very comfy!");
       }
       else{
           
       }
	}
}