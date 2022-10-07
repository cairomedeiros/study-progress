package entities;

public abstract class Animal {
	private double height;
	private double weigth;
	private String color;
	
	public Animal() {
		
	}

	public Animal(double height, double weigth, String color) {
		this.height = height;
		this.weigth = weigth;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract String locomover();
	public abstract String alimentar();
	
}
