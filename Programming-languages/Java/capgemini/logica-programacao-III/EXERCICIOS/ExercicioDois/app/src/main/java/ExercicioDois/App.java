package ExercicioDois;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
    
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            int numero = leitorScanner.nextInt();
            
            if(numero == 0) {
                System.out.println("O n�mero � zero");
            } else{
                if(numero > 0) {
                    System.out.println("O n�mero � positibo");
                } else {
                    System.out.println("O n�mero � negativo");
                }
            }
            
            System.out.println("Deseja continuar? s - sim / n - n�o");
            desejaContinuar = leitorScanner.next().charAt(0);
        }
    }
}
