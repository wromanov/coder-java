package testes.escolapoo;

import testes.escola.Disciplina;
import testes.escola.Professor;

public class MuitosParaMuitos {

    public static void main(String[] args) {

        Disciplina disciplina01 = new Disciplina();
        disciplina01.setNome("Matematica");
        disciplina01.setCargaHoraria(80);

        Disciplina disciplina02 = new Disciplina();
        disciplina02.setNome("Portugues");
        disciplina02.setCargaHoraria(80);

        Professor professor01 = new Professor();
        professor01.setNome("Jao");
        professor01.setMatricula(123);
        professor01.setFormacaoAcademica("Licenciado");
        professor01.setSalario(10);

        Professor professor02 = new Professor();
        professor02.setNome("Maria");
        professor02.setMatricula(999);
        professor02.setFormacaoAcademica("Licenciado");
        professor02.setSalario(30);

        //Relação (Bidireciona) Jao com Matemática
        professor01.adicionarDisciplina(disciplina01);
        disciplina01.adicionarProfessor(professor01);

        //Relação Jao com Português
        professor01.adicionarDisciplina(disciplina02);
        disciplina02.adicionarProfessor(professor01);

        //Relação Maria com Português
        professor02.adicionarDisciplina(disciplina02);
        disciplina02.adicionarProfessor(professor02);

        //Listar Disciplinas da Professora Maria (Método FOR)
        System.out.println("\nDisciplinas da Professora Maria");
        for (int i = 0; i < professor02.quantidadeDisciplinas(); i++) {
            System.out.println(professor02.getDisciplinas(i).getNome());
        }

        //Listar Disciplinas do Professor Jao
        System.out.println("\nDisciplinas do Professor Jao");
        professor01.listarDisciplinas();

        //Listar Professoras da Disciplina Matemática
        System.out.println("\nProfessores da disciplina Matematica");
        disciplina01.listarProfessores();

        //Listar Professoras da Disciplina Matemática (Método do FOR)
        System.out.println("\nProfessores da disciplina Portugues");
        for (int i = 0; i < disciplina02.quantidadeProfessores(); i++) {
            System.out.println(disciplina02.getProfessores(i).getNome());
        }


    }

}
