package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        //Cria variavel do tipo usuário e coloca na lista.
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);


        //Cria diretamente um objeto e coloca dentro da lista.
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        //Acessando pelo índice
        System.out.println(lista.get(3));

        //Verificando conteúdo de uma lista
        System.out.println("Tem? " + lista.contains(new Usuario("Manu")));

        //Removendo elemento da lista pelo índice
        lista.remove(1);

        //Removendo elemento da lista pelo objeto
        lista.remove(new Usuario("Lia"));


        //Percorrendo Lista
        for (Usuario u: lista) {
            System.out.println(u);
        }


    }

}
