package streams;

import streams.Aluno;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Walace", 8.1);
        Aluno a2 = new Aluno("Walace", 8.1);
        Aluno a3 = new Aluno("Eliane", 7.1);
        Aluno a4 = new Aluno("Eliane", 7.1);
        Aluno a5 = new Aluno("Sophia", 6.1);
        Aluno a6 = new Aluno("Miguel", 9.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        System.out.println("distinct...");
        //Distingui elementos iguais de uma lista
        //Necessário implementar Equals
        alunos.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        //Skip pula um determinado números de elementos numa lista.
        //Limit limita a quantidade final de elementos de uma lista.

        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nTakeWile");
        //Pega elementos enquanto acontecer uma determinada condição
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);

    }
}
