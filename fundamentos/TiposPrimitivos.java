package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //Tipos numéricos Inteiros

        byte anosDeEmpresa = 23; // -127 a 127
        short numeroDeVoos = 32767;
        int id = 56789;


        /* Já no caso do long todo número que entrarmos sem ponto flutuante é um int, então se fizermos: "long l = 10000000000"
        O compilador fala que o número 10000000000 é muito grande para um int, mas novamente, como você sabe que esse numero é para um long
        e cabe em um long, deve deixar explícito com o l: long l = 10000000000L */

        long pontosAcumulados = 3_134_845_233L; //Necessário colocar o "L" no final do valor para indicar que é um valor long, se não o java trata como tipo Inteiro.

        /* Quando você atribui um número decimal a uma variável primitiva o compilador entende esse número como
        um double. Então se você entrar com 5.0, 45.5, qualquer número com ponto flutuante, este será um double,
        e como double é maior do que float se fizer: "float f = 5.0," Está falando para o compilador que quer colocar
        um literal double em um float e isso ele não deixa! Mas como você sabe que na verdade o valor 5 cabe em um float você faz um cast: "float f = (float)5.0"
        ou para simplificar: float f = 5.0F */

        //Tipos numéricos Reais (Ponto Flutuante)
        float salario = 11_445.44F; //Necessário colocar com "F" no final do valor para indicar que é um valor Float, se não java trata como Double.

        //Tipo Booleano
        boolean estadoDeFerias = false;

        //Tipo caractere
        char status = 'A'; // Só aceita um caracter

        //ou usar um código da tabela unicode

        char unicode = '\u0005';

        //Verificar tipo de variável
        System.out.println(((Object)salario).getClass().getSimpleName());

    }
}
