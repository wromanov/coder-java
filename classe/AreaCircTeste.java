package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5.6);
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(3);
        //a2.pi = 5; //Modificando o atributo PI


        System.out.println(a2.area());
        System.out.println(AreaCirc.area(10));
        System.out.println("Minha versão do PI = "+ AreaCirc.PI);
        System.out.println("Versão PI do Java = " + Math.PI);

    }

}
