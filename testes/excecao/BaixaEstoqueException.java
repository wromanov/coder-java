package testes.excecao;

public class BaixaEstoqueException extends Exception{
    public BaixaEstoqueException(String message, Throwable cause) {
        super(message, cause);
    }
}
