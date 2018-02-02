package br.com.napro;

public class Person {
	
	private String name;
	private char sex;
	private double weight;
	private double height;
	
	public Person() {
	}
	
	public Person(String name, char sex, double weight, double height) {
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Pessoa\n\n" + "\nNome: " + getName() + "\nSexo: " + getSex() + "\nAltura: "
				+ getHeight() + "\nPeso: " + getWeight()
				+ "\n";
	}

}

