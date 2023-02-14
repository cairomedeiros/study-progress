package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Baleia;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite C=cavalo, B=baleia, D=cachorro, A=aguia:  ");
		char animal = sc.nextLine().charAt(0);
		System.out.print("Digite o peso do animal: ");
		double weight = sc.nextDouble();
		System.out.print("Digite a altura: ");
		double height = sc.nextDouble();
		System.out.print("Digite a cor: ");
		String color = sc.next();
		
		System.out.println(animal);
		if(animal =='B') {
			System.out.println("entrou");
			Baleia b = new Baleia(height, weight, color);
			System.out.println(b);
		}else {
			System.out.println("erro");
		}
		
		
		
		
		sc.close();
	}

}
