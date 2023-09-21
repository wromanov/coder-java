package excecao;

public class ProdutoInativoException extends RuntimeException{

    //Criando uma exceção personalizada Unchecked
    public ProdutoInativoException(String message) {
        super(message);
    }
}
