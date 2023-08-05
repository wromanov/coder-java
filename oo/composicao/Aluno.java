package oo.composicao;

import java.util.ArrayList;

public class Aluno {

    final String nome;

    final ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso (Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    //M�todo usado sempre que voc� quer converter um objeto para o formato String
    public String toString() {
        return nome;
    }


}
