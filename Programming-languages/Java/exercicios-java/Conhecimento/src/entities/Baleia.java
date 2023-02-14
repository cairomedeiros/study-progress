package entities;

import type.Mamifero;

public class Baleia extends Animal implements Mamifero{
	
	public Baleia() {
		
	}
	
	
	

	public Baleia(double height, double weigth, String color) {
		super(height, weigth, color);
		// TODO Auto-generated constructor stub
	}


	

	@Override
	public String toString() {
		return "Baleia [locomover()=" + locomover() + ", alimentar()=" + alimentar() + ", getHeight()=" + getHeight()
				+ ", getWeigth()=" + getWeigth() + ", getColor()=" + getColor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}




	@Override
	public String locomover() {
		// TODO Auto-generated method stub
		return "NADANDO";
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "SE ALIMENTA DE CAMARÕES";
	}

	@Override
	public double alturaDpeso(double weigth, double heigth) {
		// TODO Auto-generated method stub
		return heigth/weigth;
	}

}
