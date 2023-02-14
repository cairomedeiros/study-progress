package entities;

public class PessoaJuridica extends Pessoa{
	private Integer numeroFunc;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFunc) {
		super(name, rendaAnual);
		this.numeroFunc = numeroFunc;
	}

	public Integer getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(Integer numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public double calc() {
		double imposto = 0.0;
		if(numeroFunc > 10) {
			imposto = rendaAnual * 0.14;
		}else {
			imposto = rendaAnual * 0.16;
		}
		return imposto;
	}
}
