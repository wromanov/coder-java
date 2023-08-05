package fundamentos;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		final double ajuste = 32;
		
		//Um dos valores precisar ser fracionado, caso contrario, o resultado será inteiro.
		//Regra - constantes são escritas em caixa alta.
		final double FATOR = 5.0 / 9.0; 
		
		double calculo = (fahrenheit - ajuste) * FATOR;
		
		System.out.printf("Fahrenheit: %.1f°F%n", fahrenheit);
		System.out.printf("Celcius: %.1f °C", calculo);
		
		sc.close();
		
	}
	
	
}
