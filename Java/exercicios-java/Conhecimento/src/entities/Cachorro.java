package entities;

import type.Mamifero;

public class Cachorro extends Animal implements Mamifero {

	@Override
	public String locomover() {
		// TODO Auto-generated method stub
		return "ANDANDO/CORRENDO";
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "RAÇÃO";
	}

	@Override
	public double alturaDpeso(double weigth, double heigth) {
		// TODO Auto-generated method stub
		return heigth/weigth;
	}

}
