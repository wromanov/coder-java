package fundamentos;

import java.util.Scanner;

public class NotacaoPonto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String b = "Bom dia X";
		// Caixa alta
		System.out.print("Informe seu nome: ");
		String s = sc.nextLine().toUpperCase();

		// Concatenar
		b = b.concat("!!!");

		// Caixa Baixa
		System.out.println("Nome em caixa alta: " + s);
		System.out.println("Nome em caixa baixa: " + s.toLowerCase());

		// Usando o replace
		b = b.replace("X", "Walace");
		System.out.println("Subsituindo o X pelo A: " + b);

		// Tamanho da String
		System.out.println("Tamanho da String b: " + b.length());

		sc.close();

	}

}
