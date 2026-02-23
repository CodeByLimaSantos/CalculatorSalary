package program;

import java.util.Locale;
import java.util.Scanner;

import Data.employeer;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		employeer person;
		person = new employeer();
		
			System.out.println("What the name of the employee? ");
			person.name = input.nextLine();
			
			
			System.out.println("What is the Gross Salary of the employee? ");
			person.GrossSalary = input.nextDouble();
			
			System.out.println("The value of tax's per month : ");
			person.Tax = input.nextDouble();
			
				person.NetSalary();
			System.out.printf("Net Salary: %.2f%n " , person.NetSalary());
			System.out.println(person);
			
			
			System.out.println("What percentage increase should be applied to this employee? ");
			double percentage = input.nextDouble();
			person.IncreaseSalary(percentage);
			
			System.out.println("the new gross salary of ," + person.name + " correspond to " + person.GrossSalary );
			
			input.close();
			
			
		
		
	}

}
