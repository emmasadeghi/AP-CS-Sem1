import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many squares would you like printed?");
		int Num = sc.nextInt();
		System.out.println(CVMath.MagicSquare(Num));
	}
}
