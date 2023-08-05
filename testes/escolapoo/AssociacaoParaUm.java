package testes.escolapoo;

import testes.escola.Aluno;
import testes.escola.Turma;

import java.util.Date;

public class AssociacaoParaUm {

    public static void main(String[] args) {


    //Estanciando TURMA01
    Turma turma1 = new Turma();

    turma1.setSigla("1A");
    turma1.setAno(1);

    //Estanciando ALUNO01
    Aluno aluno1 = new Aluno();
    aluno1.setNome("Jao");
    aluno1.setMatricula(123);
    aluno1.setDataNascimento(new Date());

    //Associando aluno01 a turma01.
    aluno1.setTurma(turma1);

    //Adicionando Alunos a turma01.
    turma1.adicionarAluno(aluno1);

    //Estanciando ALUNO02
    Aluno aluno2 = new Aluno();
    aluno2.setNome("Ze");
    aluno2.setMatricula(999);
    aluno2.setDataNascimento(new Date());
    aluno2.setTurma(turma1);
    turma1.adicionarAluno(aluno2);


    System.out.println("Dados Aluno 1");
    System.out.println(aluno1.getNome());
    System.out.println(aluno1.getTurma().getSigla());
    System.out.println(turma1);

    //Método 1 - For para exibir lista de alunos
   for (int i = 0; i < turma1.quantidadeAlunos(); i++) {
       System.out.println(turma1.getAluno(i).getNome());

   }

    //Método 2 - Função para exibir a lista de alunos
    turma1.exibirAlunos();





    }

}
