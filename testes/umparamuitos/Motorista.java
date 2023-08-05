package testes.umparamuitos;

import java.util.ArrayList;

public class Motorista {
    String nome;
    String cnh;
    ArrayList<Veiculo> veiculos;

    Motorista (String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        veiculos = new ArrayList<>();
    }

    void adicionarVeiculos (String placa, String fabricante, int dataFabricacao) {
        veiculos.add(new Veiculo(placa, fabricante, dataFabricacao));
    }

    void removerVeiculos (int posicao) {
        veiculos.remove(posicao);
    }

}
