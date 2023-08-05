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

    //Método usado sempre que você quer converter um objeto para o formato String
    public String toString() {
        return nome;
    }


}
