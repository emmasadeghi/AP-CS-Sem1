
import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Spiderman x = new Spiderman();
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillain("Green Goblin");
		
		Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setAge(28);
		z.setVillain("Mysterio");
		
		System.out.println("The villain is " + y.getVillain());
		
		Spiderman s = new Spiderman("Bobby Bob", 19, "Megamind");
		
		
	}
}