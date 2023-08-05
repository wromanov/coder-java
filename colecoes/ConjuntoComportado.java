package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        //Estanciando um conjunto e amarrando o tipo do conjunto como "String"
        Set<String> lista = new HashSet<String>();

        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");


        for (String exibir:lista) {
            System.out.println(exibir);
        }
        System.out.println();

        //O HashSet não garante a ordem de inserção, para isso use o TreeSet.
        SortedSet<String> listaOrdenada = new TreeSet<>();

        listaOrdenada.add("Ana");
        listaOrdenada.add("Carlos");
        listaOrdenada.add("Luca");
        listaOrdenada.add("Pedro");


        for (String exibir:lista) {
            System.out.println(exibir);
        }

    }
}
