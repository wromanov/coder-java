package fundamentos;

import java.util.Scanner;



public class Console {
	public static void main(String[] args) {
		/*
		 * Resolvendo problema do nextInt() que deixa \n no buffer de entrada, ap�s
		 * apertarmos o ente
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine(); // l� o "\\n" que o teclado.nextInt() deixa para tr�s.

		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();

		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();

		System.out.printf("Nome: %s %s \nIdade: %d", nome, sobrenome, idade);

		teclado.close();

	}

}
