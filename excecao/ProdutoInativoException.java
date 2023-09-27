package excecao;

public class ProdutoInativoException extends ProdutoException {

    //Criando uma exceção personalizada Unchecked
    public ProdutoInativoException(String message) {
        super(message);
    }
}
