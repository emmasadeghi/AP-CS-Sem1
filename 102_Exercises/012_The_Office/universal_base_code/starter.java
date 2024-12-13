/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		
		Employee emma = new Employee(1989, "Emma", "Sadeghi", 6078);
		emma.employeeToString();
		
		pam.raiseSalary(80);
		emma.raiseSalary(80);

		System.out.println("Micheal's salary is $"+michael.getSalary());
		System.out.println("Micheal's annual salary is $"+michael.getAnnualSalary());
			System.out.println(" ");
		System.out.println("Dwights's salary is $"+dwight.getSalary());
		System.out.println("Dwight's annual salary is $"+dwight.getAnnualSalary());
			System.out.println(" ");
		System.out.println("Jim's salary is $"+jim.getSalary());
		System.out.println("Jim's annual salary is $"+jim.getAnnualSalary());
			System.out.println(" ");
		System.out.println("Pam's salary is $"+pam.getSalary());
		System.out.println("Pam's annual salary is $"+pam.getAnnualSalary());
			System.out.println(" ");
		System.out.println("Emma's salary is $"+emma.getSalary());
		System.out.println("Emma's annual salary is $"+emma.getAnnualSalary());
		
		
	}	
}
