package ExercicioQuatro;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float valor;
        float valorDescontado;
        int ano;
        float desconto;
        
        float porcentagem= 0.0f;
        
        boolean sistema = true;
        
        while(true){
            System.out.println("Digite o valor do carro.");
            valor = leitor.nextFloat();

            System.out.println("Digite o ano do carro.");
            ano = leitor.nextInt();
            
            
            if(ano <= 2000){
               porcentagem = 0.012f;
            }else{
               porcentagem = 0.007f;
            }
            
            desconto = valor * porcentagem;
            valorDescontado = valor - desconto;
            
            System.out.println("O valor é: " + valorDescontado + " e o desconto: "
                    + desconto);
            
            System.out.println("Deseja continuar? S - sim/ N - não");
            String continuar = leitor.nextLine();
            
            if("S"){
                
            }
        }
        
    }
}
