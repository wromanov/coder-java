package testes.excecao;

public class ProdutoSemEstoqueException extends ProdutoException{
    public ProdutoSemEstoqueException(String message) {
        super(message);
    }
}
