package testes.javaoo;

public class Banco {

    public static void main(String[] args) {

        Conta conta = new Conta();
        Conta conta2 = new Conta();

        conta.numeroConta = 1;
        conta.titular.nome = "Walace";
        conta.saldo = 60.0;

        conta2.numeroConta = 2;
        conta2.titular.nome = "Eliane";
        conta2.saldo = 0.0;

        //conta.sacar(10);
        //conta.depositar(50);
        System.out.println(conta.transferir(conta2, 60.1));

        System.out.println("Titular: " + conta.titular.nome);
        System.out.println("Numero Conta: " + conta.numeroConta);
        System.out.println("Saldo: " + conta.saldo);
        System.out.println();

        System.out.println("Titular: " + conta2.titular.nome);
        System.out.println("Numero Conta: " + conta2.numeroConta);
        System.out.println("Saldo: " + conta2.saldo);


    }


}
