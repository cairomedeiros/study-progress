import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double fir;
		double sec;
		
		System.out.println("digite o primeiro valor.");
		fir = leitor.nextDouble();
		System.out.println("digite o segundo valor.");
		sec = leitor.nextDouble();
		
		double soma = fir + sec;
		
		System.out.println("soma das variáveis é: " + soma);

	}

}
