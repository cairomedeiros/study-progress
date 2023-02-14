package ExercicioDois;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
    
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            int numero = leitorScanner.nextInt();
            
            if(numero == 0) {
                System.out.println("O número é zero");
            } else{
                if(numero > 0) {
                    System.out.println("O número é positibo");
                } else {
                    System.out.println("O número é negativo");
                }
            }
            
            System.out.println("Deseja continuar? s - sim / n - não");
            desejaContinuar = leitorScanner.next().charAt(0);
        }
    }
}
