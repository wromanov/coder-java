package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�rio: ");
		String salario01 = sc.nextLine().replace(",", ".");
		
		System.out.print("Informe o segundo sal�rio: ");
		String salario02 = sc.nextLine().replace(",", ".");
		
		System.out.print("Informe o terceiro sal�rio: ");
		String salario03 = sc.nextLine().replace(",", ".");
		
		//Convertendo String para Double
		double salario1 = Double.parseDouble(salario01);
		double salario2 = Double.parseDouble(salario02);
		double salario3 = Double.parseDouble(salario03);
		
		double media = (salario1 + salario2 + salario3) / 3;
	
		System.out.printf("M�dia: R$ %.2f", media);
		
		sc.close();

		
		
	}

}
