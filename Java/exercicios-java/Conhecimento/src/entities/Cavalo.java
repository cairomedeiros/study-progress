package entities;

import type.Mamifero;

public class Cavalo extends Animal implements Mamifero{

	@Override
	public String locomover() {
		// TODO Auto-generated method stub
		return "CORRENDO/TROTANDO";
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "GRAMA";
	}

	@Override
	public double alturaDpeso(double weigth, double heigth) {
		// TODO Auto-generated method stub
		return heigth/weigth;
	}

}
