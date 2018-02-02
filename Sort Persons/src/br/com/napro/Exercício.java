package br.com.napro;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;


public class Exercício {

	public static void main(String[] args) {

		NumberFormat formatter = new DecimalFormat("#0.00");
		NumberFormat formatterPeso = new DecimalFormat("#00.00");
		String nomes[] = new String[250];
		double alturas[] = new double[250];
		char sexos[] = new char[250];
		double pesos[] = new double[250];
		Person persons[] = new Person[250];
		double heights[] = new double[250];
		double weights[] = new double[250];
		char sexx[] = new char[250];
		double maxValue = heights[0];
		String maisAlta = "";
		double mediaPeso = 0;
		ArrayList<Character> homem = new ArrayList<Character>();
		ArrayList<Character> mulher = new ArrayList<Character>();

		for (int i = 0; i < 250; i++) {
			Person pessoa = new Person();
			NameGenerator name = new NameGenerator();
			nomes[i] = NameGenerator.generateName();
			pessoa.setName(nomes[i]);

			HeightGenerator height = new HeightGenerator();
			alturas[i] = HeightGenerator.generateHeight();
			heights[i] = alturas[i];
			pessoa.setHeight(alturas[i]);

			SexGenerator sex = new SexGenerator();
			sexos[i] = SexGenerator.generateSex();
			sexx[i] = sexos[i];
			pessoa.setSex(sexos[i]);

			WeightGenerator weight = new WeightGenerator();
			pesos[i] = WeightGenerator.generateWeight();
			weights[i] = pesos[i];
			pessoa.setWeight(pesos[i]);
			persons[i] = pessoa;

		}

		for (int i = 0; i < heights.length; i++) {
			if (heights[i] > maxValue) {
				maxValue = heights[i];

				maisAlta = persons[i].getName();
			}
		}
		for (int i = 0; i < weights.length; i++) {
			mediaPeso += weights[i]/250;
		}

		for (int i = 0; i < sexx.length; i++) {
			if (sexx[i] == 'M') {
				homem.add(sexx[i]);
			} else {
				mulher.add(sexx[i]);
			}
			mediaPeso += weights[1];
		}
		
		mediaPeso = (mediaPeso/250);

		System.out.println("A pessoa mais alta é " + maisAlta + ", medindo " + formatter.format(maxValue)+"cm");

		System.out.println("A média de peso das 250 pessoas é " + formatterPeso.format(mediaPeso) +"kg");

		System.out.println("Quantidade total de homens: " + (homem.size()));

		System.out.println("Quantidade total de mulheres: " + (mulher.size()));

	}

}
