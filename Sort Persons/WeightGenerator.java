package br.com.napro;

public class WeightGenerator {

	public static double generateWeight() {
		double random = 35.0 + Math.random() * (95.0-35.0);
		return random;
		

	}
}
