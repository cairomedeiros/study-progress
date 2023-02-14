package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno alu = new Aluno();
		
		System.out.print("Digite seu nome: ");
		alu.name = sc.nextLine();
		System.out.print("Digite a primeira nota: ");
		alu.primeiroTri = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		alu.segundoTri = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		alu.terceiroTri = sc.nextDouble();
		
		double sum = alu.primeiroTri + alu.segundoTri + alu.terceiroTri;
		
		if(sum >= 60) {
			System.out.print("FINAL GRADE: " + sum);
			System.out.println();
			System.out.print("PASS!");
		}else if(sum < 60) {
			System.out.print("FINAL GRADE: " + sum);
			System.out.println();
			System.out.print("FAILED");
			System.out.println();
			System.out.print("Missing points: " + alu.missingPoints());
		}
		
		
		
		sc.close();
		

	}

}
