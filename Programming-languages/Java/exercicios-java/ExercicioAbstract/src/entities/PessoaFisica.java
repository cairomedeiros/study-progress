package entities;

public class PessoaFisica extends Pessoa{
	private Double gastoSaude;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calc() {
		double imposto = 0.0;
		if(rendaAnual < 20000) {
			imposto = (rendaAnual * 0.15) - (gastoSaude * 0.5);
		}else {
			imposto = (rendaAnual * 0.25) - (gastoSaude * 0.5);
		}
		
		return imposto;
	}
}
