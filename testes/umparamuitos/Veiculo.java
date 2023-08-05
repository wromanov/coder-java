package testes.umparamuitos;

public class Veiculo {
    String placa;
    String fabricante;
    int anoFabricacao;

    Veiculo () {

    }

    Veiculo (String placa, String fabricante, int anoFabricacao) {
    this.placa = placa;
    this.fabricante = fabricante;
    this.anoFabricacao = anoFabricacao;
    }

    String getPlaca () {
        return placa;
    }

    String getFabricante () {
        return fabricante;
    }



}
