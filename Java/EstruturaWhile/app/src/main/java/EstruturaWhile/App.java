
package EstruturaWhile;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        
        
        
        int t = 10;
        
        do{
            
            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();
            
            System.out.println("O nome do aluno �: " + nomeAluno + 
                    " e a sua idade �: " + idadeAluno);
            
            //t = t -1;
        }while(t >= 1);
    }
}
