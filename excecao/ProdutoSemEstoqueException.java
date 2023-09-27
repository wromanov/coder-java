package excecao;

public class ProdutoSemEstoqueException extends ProdutoException{

    //Exceção do Tipo Checked, o qual precisa ser tratada.
    private final int estoqueDisponivel;
    private final int estoqueSolicitado;

    //Por boa prática devemos lançar exceções específicas, e podemos capturar as exceções com um tipo menos específico.

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
