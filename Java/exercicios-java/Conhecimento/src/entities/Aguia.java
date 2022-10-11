package entities;

import type.Ave;

public class Aguia extends Animal implements Ave{

	@Override
	public String locomover() {
		// TODO Auto-generated method stub
		return "VOANDO";
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "SE ALIMENTA DE ANIMAIS TERRESTRES MENORES";
	}

	@Override
	public double pesoXaltura(double weigth, double heigth) {
		// TODO Auto-generated method stub
		return weigth * heigth;
	}

}
