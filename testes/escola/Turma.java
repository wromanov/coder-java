package testes.escola;

import java.util.ArrayList;

public class Turma {
    private String sigla;
    private int ano;

    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    public Turma() {
        //Quando o objeto Turma é criado, uma lista de alunos também é estanciada.
        alunos = new ArrayList<>();
    }


    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void excluirAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public int quantidadeAlunos() {
        return alunos.size();
    }

    public Aluno getAluno(int posicao) {

        return alunos.get(posicao);
    }


    public String getSigla() {

        return sigla;
    }

    public void setSigla(String sigla) {

        this.sigla = sigla;
    }

    public int getAno() {

        return ano;
    }

    public void setAno(int ano) {

        this.ano = ano;
    }

    //Método para exibir alunos contidos na lista.
    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

}