package testes.javaoo;

public class Conta {

    int numeroConta;
    Cliente titular;
    double saldo;

    Conta() {
        titular = new Cliente();
    }

    void sacar(double valor) {
        saldo -= valor;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    String transferir(testes.javaoo.Conta contaDestino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            return "Transação executada com sucesso.";
        } else {
            return "Saldo insuficiente em conta para executar a transação.";
        }

    }

}
