package ExercicioQuatro;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float valor = 0.0f;
        float valorDescontado = 0.0f;
        int ano = 0;
        float desconto = 0.0f;
        int carros = 0;
        int carrosSemiNovos = 0;
        float porcentagem= 0.00f;
        
        char repetir = 's';
        
        while(repetir == 's' || repetir == 'S'){
            System.out.println("Digite o valor do carro.");
            valor = leitor.nextFloat();

            System.out.println("Digite o ano do carro.");
            ano = leitor.nextInt();
            
            
            if(ano <= 2000){
               porcentagem = 0.12f;
            }else{
               porcentagem = 0.07f;
               carrosSemiNovos++;
            }
            
            carros++;
            
            desconto = valor * porcentagem;
            valorDescontado = valor - desconto;
            
            System.out.println("O valor é: " + valorDescontado + " e o desconto: "
                    + desconto);
            
            System.out.println("Deseja continuar? S - sim/ N - não");
            repetir = leitor.next().charAt(0);
            
           
        }
        
        System.out.println("O total de carros seminovos é: " + carrosSemiNovos);
        System.out.println("O total de carros é: " + carros);
        
    }
}
