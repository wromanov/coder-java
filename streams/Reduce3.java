package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Walace", 8.1);
        Aluno a2 = new Aluno("Eliane", 7.1);
        Aluno a3 = new Aluno("Sophia", 6.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3);

        Predicate<Aluno> isAproved = a -> a.nota >= 3;
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinarMedia(m1, m2);

        Media media= alunos.parallelStream().filter(isAproved).map(apenasNota).reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A média da turma é " + media.getValor());

    }



}
