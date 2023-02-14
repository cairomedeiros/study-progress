package entities;

public class Aluno {
	
	public String name;
	public double primeiroTri;
	public double segundoTri;
	public double terceiroTri;
	
	public double missingPoints() {
		return 60 - (primeiroTri + segundoTri + terceiroTri) ;
	}
}
