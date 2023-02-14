package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products products = new Products();
		
		System.out.println("Digite a data:");
		System.out.print("name: ");
		products.name = sc.nextLine();
		System.out.print("price: ");
		products.price = sc.nextDouble();
		System.out.print("quantity: ");
		products.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Data" + products);
		
		System.out.println();
		System.out.println("Numero a ser adicionado no estoque: ");
		int quantity = sc.nextInt();
		products.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data" + products);
		
		System.out.println();
		System.out.println("Numero a ser removido do estoque: ");
		quantity = sc.nextInt();
		products.RemoveProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data" + products);
		
		
		sc.close();
	}

}
