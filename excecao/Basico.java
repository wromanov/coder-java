package excecao;

import streams.Aluno;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        //Devemos sempre tentar tratar o erro de forma específica, porém as vezes queremos tratar de modo genérico.

        /* Um bloco "try" é um bloco que contem um código que pode gerar erro,
         * A partir do momento que esse código pode gerar erro, podemos tratá-lo
         * A partir de um "catch", tratando o erro no "catch" temos a possibilidade
         * de mostrar uma mensagem, gerar um outro erro ou silenciar um erro
         */

        //Tratando erro de forma genérica com Exception
        try {
            imprimirNomeAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir no nome do usuário.");;
        }

        /* O método printStackTraca imprimir no console a pilha de execução, ou seja,
           onde ocorreu o problema, ou ponto que a exceção foi lançada */

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


        //Método getMessage permite personalizar a mensagem de erro, com o uso de uma string.
        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        //Silenciando erro, nunca deve-se usar esse recurso, somente em situação muito pontuais.
        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            //System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("FIM");

    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }

}
