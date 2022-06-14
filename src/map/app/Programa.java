package map.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votos = new LinkedHashMap<>();

		String path = "C:\\temp\\ws-java\\generics-set-map\\src\\map\\votos.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String nome = fields[0];
				int contador = Integer.parseInt(fields[1]);

				if (votos.containsKey(nome)) {
					int votosMomento = votos.get(nome);
					votos.put(nome, contador + votosMomento);
				} else {
					votos.put(nome, contador);
				}

				line = br.readLine();
			}

			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();

	}

}
