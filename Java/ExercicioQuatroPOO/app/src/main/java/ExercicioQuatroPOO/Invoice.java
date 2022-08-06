package ExercicioQuatroPOO;


public class Invoice {
    private int item;
    private String descricao;
    private int quantComprada;
    private float precoUnit;

    public Invoice(int item, String descricao, int quantComprada, float precoUnit) {
        this.item = item;
        this.descricao = descricao;
        
        if(quantComprada < 0){
            this.quantComprada = 0;
        }else{
            this.quantComprada = quantComprada;
        }
        
        if(precoUnit < 0){
            this.precoUnit = 0;
        }else{
            this.precoUnit = precoUnit;
        }
        
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }
    
    

    
    
    
}
