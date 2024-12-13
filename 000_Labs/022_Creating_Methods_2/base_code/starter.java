

import java.util.Scanner;
import java.util.Random;

class starter{
    public static int power(int x,int y){
        int z = x; 
        while(y>1){
            z = z * x;
            y--;
            }
             return z;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your base number:");
            int x = sc.nextInt();
            System.out.println("Enter an exponent for your base:");
            int y = sc.nextInt();
            System.out.print(x+" to the power of "+y+" is equal to: ");
            System.out.print(power(x, y));
    }
}