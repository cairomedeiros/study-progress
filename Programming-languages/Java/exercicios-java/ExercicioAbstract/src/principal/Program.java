package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Número de contribuintes: ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Pessoa #" + (i + 1) + " data: ");
			System.out.println("pessoa física ou jurídica? (f/j) ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda: ");
			double rendaAnual = sc.nextDouble();
			if(c == 'f') {
				System.out.print("Gasto com saúde: ");
				double gastosSaude = sc.nextDouble();
				
				PessoaFisica pf = new PessoaFisica(name, rendaAnual, gastosSaude);
				list.add(pf);
			}else {
				System.out.print("Número de funcionários: ");
				int numeroFunc = sc.nextInt();
				
				PessoaJuridica pj = new PessoaJuridica(name, rendaAnual, numeroFunc);
				list.add(pj);
			}
		}
		
		System.out.println();
		double total = 0.0;
		for(Pessoa pessoa : list) {
			System.out.println(pessoa.getName() + ": $ " + pessoa.calc());
			 total += pessoa.calc();
		}
		
		System.out.println("TOTAL TAXES: $ " + total);
		
		sc.close();
	}

}
