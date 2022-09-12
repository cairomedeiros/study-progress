package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		Pessoas[] vect = new Pessoas[n];
		
		for(int i = 0; i<n; i++) {
			
			System.out.print("Digite o nome da pessoa: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite a idade da pessoa: ");
			int age = sc.nextInt();
			System.out.print("Digite a altura da pessoa: ");
			double heigth = sc.nextDouble();
			vect[i] = new Pessoas(name, age, heigth);
			
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i].getHeigth();
		}
		
		double avg = sum / n;
		
		for(int i = 0; i< n; i++) {
			if(vect[i].getAge()< 16) {
				System.out.println("pessoas com menos de 16 anos: "+ vect[i].getName());
			}
		}
		
		System.out.printf("media altura: %.2f", avg);
		
		sc.close();
	}

}
