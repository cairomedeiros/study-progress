package ExercicioUm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int n;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("digite o valor");
        n = leitorScanner.nextInt();
        
        if(n >= 100 && n <= 200){
             System.out.println("O valor está entre o intervalo!");
        }else{
             System.out.println("O valor não está no intervalo");
        }
        
       
    }
}
