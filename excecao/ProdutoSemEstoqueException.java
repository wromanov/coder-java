package excecao;

public class ProdutoSemEstoqueException extends RuntimeException{
    public ProdutoSemEstoqueException(String message) {
        super(message);
    }
}
