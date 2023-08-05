package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];

        // Visualizar conteúdo de um Array no console.
        System.out.println("Notas do Aluno A: " + Arrays.toString(notasAlunoA));

        //Acessando os elementos do Array e atribuindo valores
        notasAlunoA[0] = 8;
        notasAlunoA[1] = 10;
        notasAlunoA[2] = 7;
        notasAlunoA[3] = 9.5;

        // Visualizar conteúdo de um Array no console.
        System.out.println("Notas do Aluno A: " + Arrays.toString(notasAlunoA));
        System.out.println();

        //Visualizando o último elemento de um array
        System.out.println("Última nota Aluno A: " + notasAlunoA[notasAlunoA.length - 1]);
        System.out.println();

        //Verificando a quantidade de posições que o Array possui
        System.out.println("Verificando o tamanho do Array: " + notasAlunoA.length);
        System.out.println();

        //Percorrendo Array
        System.out.println("Percorrendo Array");
        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA+= notasAlunoA[i];
            System.out.println(notasAlunoA[i]);
        }
        System.out.println();

        System.out.println("Media das Notas Aluno A: " + totalAlunoA / 3);

        //Criando Array e inicializando os valores diretamente.
        final double notaArmazenada = 5.6;
        double[] notasAlunoB = {10, 9, notaArmazenada, 7,};

        //Percorrendo Array
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
            System.out.println(notasAlunoB[i]);
        }
        System.out.println();

        System.out.println("Media das Notas Aluno B: " + totalAlunoB / 3);


    }

}
