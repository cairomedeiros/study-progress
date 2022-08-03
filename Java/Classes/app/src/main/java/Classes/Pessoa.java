package Classes;

public class Pessoa {
    //atributos
    private float peso;
    private float altura;
    
    public float calcularImc(){
        float imc = peso / (altura*altura);
        return imc;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
}
