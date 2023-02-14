package entities;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHouer;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valuePerHouer) {
		this.name = name;
		this.hours = hours;
		this.valuePerHouer = valuePerHouer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHouer() {
		return valuePerHouer;
	}

	public void setValuePerHouer(Double valuePerHouer) {
		this.valuePerHouer = valuePerHouer;
	}
	
	public double payment() {
		return hours * valuePerHouer;
	}
	
	
}
