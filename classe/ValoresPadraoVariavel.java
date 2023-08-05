package classe;

public class ValoresPadraoVariavel {
    /* Valores Padrões de Inicialização de Variáveis quando estão vazias.
    *  Variáveis definidas diretamente no corpo da classe, fora dos métodos,
    * serão inicializadas com o valor padrão conforme abaixo. */

    /* Variáveis criadas dentro de construtores e métodos devem ser inicializadas com seus respectivos valores. */

    //byte, short, int, long -> 0
    //float, double -> 0.0
    //boolean -> false
    //char -> '\u0000'
    //Objetos (String e Demais) -> Null

    int a; // Valor Padrão de Inicialização = 0
    double b; // Valor Padrão de Inicialização = 0.0
    String c; // Valor Padrão de Inicialização = NULL
    char d; // Valor Padrão de Inicialização = '\u0000' - Primeiro caractere da tabela unicode.
    boolean e; // Valor Padrão de Inicialização = false


    ValoresPadraoVariavel() {

    }

    String obterTextoFormatado() {
        return String.format(" Int a = %d \n double b = %f \n String c = %s \n char d = %s \n boolean e = %b", a, b, c, d, e);
    }



}
