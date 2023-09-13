package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Walace", 8.1);
        Aluno a2 = new Aluno("Eliane", 2.1);
        Aluno a3 = new Aluno("Sophia", 6.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3);

        Predicate<Aluno> isApproved = a -> a.nota >= 3;

        //Inverte a condição existente de "isApproved", verificando agora se a nota <= 3.
        Predicate<Aluno> isReproved = isApproved.negate();


        //Verifica se todos os alunos deram Match no predicado "isApproved", e retornar verdadeiro ou falso.
        System.out.println("Todos os alunos foram aprovados: " + alunos.stream().allMatch(isApproved));

        //Verifica se existe algum aluno que deu Match no predicado "isApproved", e retorna verdadeiro ou falso.
        System.out.println("Existe algum aluno que foi aprovado: " + alunos.stream().anyMatch(isApproved));

        //Verifica se nenhum aluno deu Match no predicado "isReproved", ou seja, se existe algum aluno com aluno reprovado na lista.
        System.out.println("Todos os alunos foram aprovados: " + alunos.stream().noneMatch(isReproved));
        //O resultado é falso porque um aluno deu Match na condição do "isReproved", o que significa que existem reprovados na lista.



    }
}
