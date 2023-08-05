package testes.wrappers;

public class TesteWrapper {

    static boolean compararInteger(Integer num01, Integer num02) {
      return  num01.intValue() == num02.intValue();
    }

    public static void main(String[] args) {

        Integer num01 = 1;
        Integer num02 = 2;

        System.out.println(compararInteger(num01, num02));



    }


}
