package excecao;

public class ClienteTeste {
    public static void main(String[] args) {

        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();

        Cliente clienteCadastrado = servicoCadastroCliente.cadastrar("Walace", 15);

        System.out.printf("Cliente cadastrado: %s\n", clienteCadastrado.getNome());



    }

}
