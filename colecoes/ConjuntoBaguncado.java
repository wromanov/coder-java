package colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ConjuntoBaguncado {

    public static void main(String[] args) {

        //Estanciando um conjunto do tipo "HeashSet" que é uma das versões do Set.
        HashSet conjunto = new HashSet();

        //Collections não suporta tipos primitivos, e converte automaticamente para Wrapper do seu tipo.

        conjunto.add(1.2); // double --> Double
        conjunto.add(true);// boolean --> Boolean
        conjunto.add("Teste");
        conjunto.add("teste");
        conjunto.add(1); //int para Integer
        conjunto.add('x'); //char --> Character

        //Verificar tamanho da colection
        System.out.println("Tamanho é " + conjunto.size());

        //Remover item da colection
        System.out.println("Tamanho é " + conjunto.remove("Teste")); //Quando o objeto é removido o valor true é retornado
        System.out.println("Tamanho é " + conjunto.remove("x"));
        System.out.println("Tamanho é " + conjunto.size());

        //Verifica conteúdo de uma colection
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        //Ver conteúdo do conjunto
        System.out.println(nums);
        System.out.println(conjunto);

        //Unindo "conjunto" com "nums".
        conjunto.addAll(nums);

        System.out.println(conjunto);

        //Limpando lista
        conjunto.clear();

        System.out.println(conjunto);


    }


}
