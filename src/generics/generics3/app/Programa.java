package generics.generics3.app;

import java.util.ArrayList;
import java.util.List;

import generics.generics3.entities.Circulo;
import generics.generics3.entities.Forma;
import generics.generics3.entities.Retangulo;

public class Programa {

	// método que retorna a soma das áreas de uma lista de figuras.
	
	public static void main(String[] args) {

		List<Forma> myFormas = new ArrayList<>();
		myFormas.add(new Retangulo(3.0, 2.0));
		myFormas.add(new Circulo(2.0));

		List<Circulo> myCirculos = new ArrayList<>();
		myCirculos.add(new Circulo(2.0));
		myCirculos.add(new Circulo(3.0));

		System.out.println("Total area: " + String.format("%.2f", totalArea(myCirculos)));
	}

	public static double totalArea(List<? extends Forma> list) {
		double sum = 0.0;
		for (Forma s : list) {
			sum += s.area();
		}
		return sum;
	}

}
