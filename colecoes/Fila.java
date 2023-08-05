package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        /* Filas podem ter tamanho delimitado e os métodos abaixo possuem retornos diferentes
        quando a fila está cheia e não é possível adicionar itens na fila */

        //Offer e ADD -> Adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia

        System.out.println(fila.add("Ana")); // Lança uma exceção se não conseguir adicionar
        System.out.println(fila.offer("Bia")); // Retorna False se não conseguir adicionar
        System.out.println(fila.add("Carlos")); // Retorna False se não conseguir adicionar
        System.out.println(fila.offer("Daniel")); // Retorna False se não conseguir adicionar
        System.out.println(fila.offer("Rafaela")); // Retorna False se não conseguir adicionar
        System.out.println(fila.add("Gui"));

        //Peek e element -> Obter o próximo elemento da Fila sem removê-lo
        // Diferença é o comportamento quando a fila está vazia
        System.out.println(fila.peek()); // Retorna o valor "Null"
        System.out.println(fila.peek());
        System.out.println(fila.element()); //Lança uma exceção
        System.out.println(fila.element());

        // fila.size()
        // fila.clear()
        // fila.isEmpty()
        // fila.contains()

        //Retorna o próximo elemento da fila e já o remove.
        System.out.println(fila.poll()); // Se a fila estiver vazia retorna "Null"
        System.out.println(fila.remove()); // Se a fila estiver vazia lança uma execção.
        System.out.println(fila.poll()); // Se a fila estiver vazia retorna "Null"
        System.out.println(fila.poll()); // Se a fila estiver vazia retorna "Null"
        System.out.println(fila.poll()); // Se a fila estiver vazia retorna "Null"
        System.out.println(fila.poll()); // Se a fila estiver vazia retorna "Null"
        System.out.println(fila.poll()); // Se a fila estiver vazia retorna "Null"


    }
}
