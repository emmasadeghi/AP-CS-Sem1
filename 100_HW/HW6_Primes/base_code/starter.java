/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
        int divide = a - 1;
        boolean primes = false;
            while(divide > 1){
                if(a % divide == 0){
                    primes = false;
                    break;
                }
                primes = true;
                divide--;
            }
        return primes;
    }
     public static void printPrimes(int b){
        boolean check;
        while(b >=0){
            check = checkPrime(b);
            if(check == true){
                System.out.println(b);
            }
            else if(b == 2){
                System.out.println(b);
            }
            b--;
        }
        return;
	} 
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find all the previous prime numbers: ");
        int check = sc.nextInt();
        System.out.println("The prime numbers less than "+check+" are: ");
        printPrimes(check);
	}
}