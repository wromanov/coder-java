package fundamentos;

import java.time.LocalDate;
import java.util.Date;

public class Import {
	public static void main(String[] args) {
		
		String s = "Bom dia!";
		
		System.out.println(s);
		
		//Usando uma biblioteca Inportada (Usando Crtl+Shift+O) 
		LocalDate localDate = LocalDate.now();
		Date data = new Date();
		
		
		LocalDate.of(2022, 04, 17);
		
		LocalDate.parse("2022-04-17");
		
		
		
		System.out.println(localDate);
		System.out.println(data);		
		
	}
	
	

}
