package generics.generics2.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import generics.generics2.entities.Produto;
import generics.generics2.services.CalculoService;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Produto> list = new ArrayList<>();

		String path = "C:\\temp\\ws-java\\generics-set-map\\src\\generics\\produtos.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			System.out.println(list);
			Produto x = CalculoService.max(list);
			System.out.println("Mais caro:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
