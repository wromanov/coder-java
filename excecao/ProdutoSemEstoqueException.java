package excecao;

public class ProdutoSemEstoqueException extends RuntimeException{

    private final int estoqueDisponivel;
    private final int estoqueSolicitado;

    public ProdutoSemEstoqueException(String message, int estoqueDisponivel, int estoqueSolicitado) {
        super(message);
        this.estoqueDisponivel = estoqueDisponivel;
        this.estoqueSolicitado = estoqueSolicitado;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public int getEstoqueSolicitado() {
        return estoqueSolicitado;
    }
}
