package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourceEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHouer = sc.nextDouble();
			
			if(c == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				OutSourceEmployee empSource = new OutSourceEmployee(name, hour, valuePerHouer, additionalCharge);
				list.add(empSource);
			}else {
				
				Employee emp = new Employee(name, hour, valuePerHouer);
				
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}
		sc.close();
	}

}
