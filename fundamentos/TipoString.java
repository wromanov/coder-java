package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2)); //Exibe o segundo caractere

        String s = "Boa tarde";

        System.out.println(s.concat("!!!")); // Concatena !!! com a string "S"

        System.out.println(s + "!!!");

        System.out.println(s.startsWith("Boa")); //Verifica a palavra que inicia a string

        System.out.println(s.toLowerCase().startsWith("Boa"));

        System.out.println(s.toUpperCase().endsWith("TARDE"));

        System.out.println(s.length()); //Diz quantos caracteres tem a string

        System.out.println(s.equals("boa tarde")); //Compara o valor da string S.

        System.out.println(s.equalsIgnoreCase("boa tarde")); // Compara o valor da String e ignora as letras maiúsculas


        var nome = "Walace";
        var sobreNome = "Delgado";
        var idade = 33;
        var salario = 5338.00;

        System.out.printf("O senhor %s %s tem %d anos e ganha %.2f reais.\n", nome, sobreNome, idade, salario);

        String frase = String.format("O senhor %s %s tem %d anos e ganha %.2f reais.", nome, sobreNome, idade, salario);

        System.out.println(frase);

        System.out.println(frase.contains("anos")); //Verifica se a palavra "anos" está dentro da string

        System.out.println(frase.indexOf("senhor")); //Informar o index da palavra "senhor" dentro da string.

        System.out.println(frase.substring(3, 20)); //Imprimi a partir da informação do index

        System.out.println(frase.substring(2));




    }
}
