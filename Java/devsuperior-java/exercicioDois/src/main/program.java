package main;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee emp = new employee();
		
		System.out.print("name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Slaary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp.toString());
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp);
		
		sc.close();
	}

}
