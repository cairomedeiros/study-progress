package ExercicioQuatroPOO;

public class Invoice {

    private int item;
    private String descricao;
    private int quantComprada;
    private float precoUnit;

    public Invoice(int item, String descricao, int quantComprada, float precoUnit) {
        this.setItem(item);
        this.setDescricao(descricao);
        this.setQuantComprada(quantComprada);
        this.setPrecoUnit(precoUnit);

    }

    public double getInvoiceAmount() {
        return quantComprada * precoUnit;
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
        if (quantComprada < 0) {
            this.quantComprada = 0;
        } else {
            this.quantComprada = quantComprada;
        }
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {

        if (precoUnit < 0) {
            this.precoUnit = 0;
        } else {
            this.precoUnit = precoUnit;
        }
    }

}
