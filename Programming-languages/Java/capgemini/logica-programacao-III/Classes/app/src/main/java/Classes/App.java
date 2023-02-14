
package Classes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Pessoa objectPessoa = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu peso.");
        
        objectPessoa.setPeso(leitor.nextFloat());
        
        System.out.println("Digite a sua altura.");
        
        objectPessoa.setAltura(leitor.nextFloat());
        
        objectPessoa.getPeso();
        
        System.out.println("O seu imc é: " + objectPessoa.calcularImc());
        
        
        
        
    }
}
