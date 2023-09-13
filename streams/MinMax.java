package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Walace", 8.1);
        Aluno a2 = new Aluno("Eliane", 7.1);
        Aluno a3 = new Aluno("Sophia", 6.1);
        Aluno a4 = new Aluno("Miguel", 9.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };
        //Quando retornamos 1 - Significa que o primeiro objeto é maior que o segundo;
        //Quando retornamos -1 - Significa que o segundo objeto é maior que o primeiro;
        //Quando retornamos 0 - Significa que os objetos são iguais.

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());

    }


}
