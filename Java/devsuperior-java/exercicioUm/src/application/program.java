package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangle;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangle ret = new retangle();
		
		System.out.println("Enter width and heigth, respective");
		ret.width = sc.nextDouble();
		ret.heigth = sc.nextDouble();
		
		System.out.println(ret.Area());
		System.out.println(ret.Diagonal());
		System.out.println(ret.Perimeter());
		
		
		sc.close();
	}

}
