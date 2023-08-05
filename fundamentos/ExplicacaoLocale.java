package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExplicacaoLocale {
	public static void main(String[] args) {
		//Alterando Locale para US, assim as entradas num�ricas receber�o '.' em vez de ','.
		Locale.setDefault(Locale.US);
		
		/* Descobri Locale do computador
		 * Podemos descobrir o locale padr�o da nossa JVM com o c�digo abaixo.
		 * https://blog.cod3r.com.br/o-que-e-locale/
		 */
		
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		System.out.println(a); 
		
		sc.close();
		
	}
	

}
