/*
 *	Author:  
 *  Date: 
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        int [] array = new int[(int)(Math.random() * 149)+51];
        int min = Integer.MAX_VALUE;        
        int max = 0;
        int ave = 0;


        for(int a = 0; a < array.length; a++){
            array[a] = (int)(Math.random() * 100)+1;
            ave = ave + array[a];
        }
        for(int b = 0; b < array.length; b++){
            if(array[b] > max){
                max = array[b];
            }
        }
        
        for(int c = 0; c < array.length; c++){
            if(array[c] < min){
                min = array[c];
            }
        }
        System.out.println("There are " + array.length + " elements");
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
        System.out.println("The average is " +  ave/array.length);
       
    }
}