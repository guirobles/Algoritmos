package br.com.napro;

import java.util.Random;

public class SexGenerator {

	private static char[] sexo = {'M', 'F'};

	private static Random rand = new Random();

	public static char generateSex() {
		return sexo[rand.nextInt(sexo.length)];

	}
}
