package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(c == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				ImportedProduct ip = new ImportedProduct(name, price, customsFee);
				list.add(ip);
			}else if( c == 'u') {
				System.out.print("Manufactured date (DD/MM/YYYY): ");
				Date manufacturedDate = sdf.parse(sc.next());
				
				UsedProduct up = new UsedProduct(name, price, manufacturedDate);
				list.add(up);
			}else {
				Product p = new Product(name, price);
				list.add(p);
			}
		}
		
		System.out.println();
		for(Product prdct : list) {
			System.out.println(prdct.priceTag());
		}
		
		sc.close();
	}

}
