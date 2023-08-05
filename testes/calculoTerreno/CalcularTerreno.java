package testes.calculoTerreno;
/* Programa destinado a calcula a área de um terreno irregular com 45 lados diferentes */
public class CalcularTerreno {
    double frente;
    double fundos;
    double ladoDireito;
    double ladoEsquerdo;

    /* Calculo
     * Passo 1 - Somar a frente do terreno e os fundos o resultado dividir por 2.
     * Passo 2 - Somar o lado direito do terreno e o lado esquerdo e o resultado dividir por 2.
     * Passo 3 - Somar multiplicar o resultado dos passos 1 e 2, o qual será a área quadrada do terreno. */

    CalcularTerreno(double frente, double fundos, double ladoDireito, double ladoEsquerdo) {
        this.frente = frente;
        this.fundos = fundos;
        this.ladoDireito = ladoDireito;
        this.ladoEsquerdo = ladoEsquerdo;
    }

    //Método Estático da Classe.
    static double CalculoTerroIrregular(CalcularTerreno terreno) {
        return ((terreno.frente + terreno.fundos) / 2) * ((terreno.ladoDireito + terreno.ladoEsquerdo) / 2);
    }

    //Método Publico - A partir de uma objeto da classe.
    double CalculoTerroIrregular2() {
        return ((frente + fundos) / 2) * ((ladoDireito + ladoEsquerdo) / 2);
    }


}
