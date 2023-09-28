package testes.excecao;

public class ProdutoSemEstoqueException extends Exception{
    public ProdutoSemEstoqueException(String message) {
        super(message);
    }
}
