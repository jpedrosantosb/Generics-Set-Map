package generics.generics1.app;

import java.util.Scanner;

import generics.generics1.services.PrintService;

public class Programa {

	/*
	 * Programa que ler uma quantidade N, e depois N números inteiros. Ao final,
	 * imprima esses números de forma organizada conforme exemplo. Em seguida,
	 * informa qual foi o primeiro valor informado
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();

		System.out.print("Quantos valores? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("Primeiro: " + x);

		sc.close();
	}

}
