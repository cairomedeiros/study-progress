package ExercicioTres;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        String nomeProduto;
        float custo;
        float venda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        int i = 0;
        
        for(; i < 2; i++){
            System.out.println("Digite o nome do produto.");
            nomeProduto = leitorScanner.next();
            
            System.out.println("Digite o preço de custo.");
            custo = leitorScanner.nextFloat();
            
            System.out.println("Digite o preço de venda."); 
            venda = leitorScanner.nextFloat();
            
            totalCusto = totalCusto + custo;
            totalVenda = totalVenda + venda;
            
            
            if(custo == venda){
                System.out.println("Empate entre os preços");
            }else{
                if(custo > venda){
                    System.out.println("Preju");
                }else{
                    System.out.println("Lucro");
                }
            }
            
            System.out.println("custo: " + custo + " venda: " + venda);
            
            
        }
        
        System.out.println("A média do preço de custo é de: " + (totalCusto/i));
        System.out.println("A média do preço de custo é de: " + (totalVenda/i));
    }
}
