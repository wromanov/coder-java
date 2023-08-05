package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        /* Map e uma estrutura chave e valor */

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); // Adiciona elementos no MAP.
        usuarios.put(2, "Ricardo"); // Adiciona o elemento no MAP e substitui o valor de "roberto" por "ricardo".
        usuarios.put(3, "Rafaela"); // Adiciona o elemento no MAP e substitui o valor de "roberto" por "ricardo".
        usuarios.put(4, "Rebeca"); // Adiciona o elemento no MAP e substitui o valor de "roberto" por "ricardo".

        System.out.println(usuarios);
        System.out.println(usuarios.size()); // Verifica a quantidade de elementos
        System.out.println(usuarios.isEmpty()); // Verifica se a lista vazia
        System.out.println(usuarios.keySet()); // Retorna os valores das chaves
        System.out.println(usuarios.values()); // Retorna apenas os valores sem as chaves.
        System.out.println(usuarios.entrySet()); // Retorna chave e valor
        System.out.println(usuarios.containsKey(4)); // Retorna um valor boolean referente a chava passada como parâmetro
        System.out.println(usuarios.containsValue("Rebeca")); // Retorna um valor boolean referente a String passada como parâmetro
        System.out.println(usuarios.get(3)); // Retorna o conteúdo da chave passada como parâmetro.
        System.out.println(usuarios.remove(1)); // Remove o objeto de acordo com a chave
        System.out.println(usuarios.remove(2, "Walace")); // Retorna false porque a chave e o valor precisam estar ser iguais conforme a lista.
        System.out.println();


        /* Existem 3 Formas Percorrer elementos de um Map */

        // Método 1 - Percorrendo Chave
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);

        }
        System.out.println();

        // Método 2 - Percorrendo Valor
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }
        System.out.println();

        // Método 3 - Percorrendo Chave e Valor ao mesmo tempo
        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ==> "); //Exibe a chave
            System.out.println(registro.getValue()); // Exibe o valor

        }


    }


}

