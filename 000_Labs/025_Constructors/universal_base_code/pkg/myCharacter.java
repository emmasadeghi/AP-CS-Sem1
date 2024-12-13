/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
    String role;
    public int Strength = 9;
    public int Dexterity = 4;
    public int Intelligence = 2;
    public int Constitution = 7;
    public int Charisma = 1;

    public myCharacter() {
        role = "no role";
    }

    public myCharacter(String r){
        if (r.equals("wizard")||r.equals("warrior")||r.equals("rogue")||r.equals("Wizard")||r.equals("Warrior")||r.equals("Rogue")){
            role = r;
        }
        else{
            role = "no role";
        }
    }

    public String getRole(){
        return role;
    }

}

