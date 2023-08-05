package classe;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@zemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@zemail.com.br";

        //Compara endereço de memória e não os atributos do objeto
        System.out.println(u1 == u2);

        //Faz comparação dos atributos entre os objetos u1 e u2.
        System.out.println(u1.equals(u2));













    }
}
