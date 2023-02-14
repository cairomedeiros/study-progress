package principal;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite o número de colunas: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i<m; i++) {
			for(int j = 0; j <n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Escolha um número da matriz: ");
		int num = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(num == mat[i][j]) {
					System.out.println("position: " +  i + ", " + j + " ");
				}
			}
		}
		
		
		sc.close();
	}
	
	

}
