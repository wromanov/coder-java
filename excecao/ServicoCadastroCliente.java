package excecao;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade) {
        if (idade < 18) {
            //return null;
            //Por boa prática não deve-se estanciar um null e sim lançar uma exceção par informar o problema.
            throw new MenorDeIdadeException("Não pode cadastrar menor de idade.");

        }

        return new Cliente(nome, idade);

    }


}
