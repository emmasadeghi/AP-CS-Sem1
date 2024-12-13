package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	String breed;
	int age;
	
	public Dog() {
		name = "Clifford";
		breed = "Big Red Dog";
		age = 3;
	}
	public Dog(String n) {
		name = n;
		breed = "Dog Dog";
		age = 1;
	}
	public Dog(String n, String b) {
		name = n;
		breed = b;
		age = 1;
	}
	public Dog(String n, int a) {
		name = n;
		breed = "Dog Dog";
		age = a;
	}
	
	public void dogToString(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Dog name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age: " + age);
		System.out.println("------------------------------");
		System.out.println("");
	}
	
	public void setName(String n){
		name = n;
	}
		
	public void setAge(int a){
		age = a;
	}
	
	public void setBreed(String b){
		breed = b;
	}
		
	public int getAge(){
		return age;
	}
	
	public boolean isSleeping(){
		boolean x;
		double rand = Math.random();
		if(rand>=0.5){
			x= true;
		}
		else{
			x=false;
		}
		return x;	
		
	}
	
	public void bark(){
		System.out.println(name+" is barking!");
	}
}