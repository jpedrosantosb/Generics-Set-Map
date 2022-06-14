package set.set2.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	/*
	 * Em um portal de cursos online, cada usu�rio possui um c�digo �nico,
	 * representado por um n�mero inteiro. Cada instrutor do portal pode ter v�rios
	 * cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser.
	 * Assim, o n�mero total de alunos de um instrutor n�o � simplesmente a soma dos
	 * alunos de todos os cursos que ele possui, pois pode haver alunos repetidos em
	 * mais de um curso. O instrutor Alex possui tr�s cursos A, B e C, e deseja
	 * saber seu n�mero total de alunos. Seu programa deve ler os alunos dos cursos
	 * A, B e C do instrutor Alex, depois mostrar a quantidade total e alunos dele,
	 * conforme exemplo.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("Quantos alunos para o curso A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			a.add(num);
		}

		System.out.print("Quantos alunos para o curso B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			b.add(num);
		}

		System.out.print("Quantos alunos para o curso C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			c.add(num);
		}

		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total de estudantes: " + total.size());

		sc.close();

	}

}
