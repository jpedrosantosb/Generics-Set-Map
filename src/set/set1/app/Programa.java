package set.set1.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import set.set1.entities.EntradaLog;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String path = "C:\\temp\\ws-java\\generics-set-map\\src\\set\\acessos.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<EntradaLog> set = new HashSet<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(" ");
				String usuario = fields[0];
				Date data = Date.from(Instant.parse(fields[1]));

				set.add(new EntradaLog(usuario, data));

				line = br.readLine();
			}
			System.out.println("Total de usuários: " + set.size());

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();

	}

}
