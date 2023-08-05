package testes.escola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    ArrayList<Professor> professores;
    ArrayList<Turma> turmas;

    public Disciplina () {
        professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void excluirProfessor (Professor professor){
        professores.remove(professor);
    }

    public int quantidadeProfessores () {
        return professores.size();
    }

    public Professor getProfessores (int posicao) {
        return professores.get(posicao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria >=0){
            this.cargaHoraria = cargaHoraria;
        }

    }

    public void listarProfessores() {
        for (Professor professor: professores){
            System.out.println(professor.getNome());
        }

    }



}
