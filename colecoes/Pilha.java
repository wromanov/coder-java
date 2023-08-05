package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // Retorna o último elemento da pilha
        System.out.println(livros.element()); // Retorna o último elemento da pilha

        System.out.println(livros.pop()); // Remove o último elemento da pilha, caso a pilha esteja vazia lança um erro de exceção
        System.out.println(livros.poll());// Remove o último elemento da pilha, caso esteja vazia retorna valor null
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        //System.out.println(livros.remove());// Remove o último elemento da pilha, caso a pilha esteja vazia retorna valor null





    }
}
