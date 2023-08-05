package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int qtdAlunos;
        int qtdNotas;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();

        System.out.print("Qual a quantidade de notas por aluno: ");
        qtdNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;

        //Percorrendo as linhas da Matriz
        for (int a = 0; a < notasDaTurma.length; a++) {
            //Percorrendo as colunas da matriz, informando o número da linha, o atributo length lê o número de colunas dessa linha.
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                //Lendo as notas dos alunos
                System.out.printf("Informe a nota do %d do aluno %d: \n", n, a);
                notasDaTurma[a][n] = sc.nextDouble();
                total += notasDaTurma[a][n];

            }

        }

        //Imprimindo
        System.out.println("Notas da turma:");
        for (double[] notas : notasDaTurma) {
            System.out.println(Arrays.toString(notas));
        }

        //Calculando a média da turma
        System.out.println();
        double media = total / notasDaTurma.length;
        System.out.println("Media da turma é = " + media);

        sc.close();

    }

}
