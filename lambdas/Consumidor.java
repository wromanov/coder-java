package lambdas;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        //Função Consumer recebe um parâmetro e não retorna nda.

        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.9);
        Produto p2 = new Produto("Notebook", 2987.99, 0.25);
        Produto p3 = new Produto("Borracha", 7.8, 0.18);
        Produto p4 = new Produto("Caderno", 19.90, 0.18);
        Produto p5 = new Produto("Lápis", 4.39, 0.19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        imprimirNome.accept(p1);
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println); // pesquisar sobre Method Reference

    }




}
