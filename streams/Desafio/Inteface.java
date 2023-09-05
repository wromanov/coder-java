package streams.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Inteface {
    public static void main(String[] args) {

        Carro c1 = new Carro("Chevorlet", "Cobalt", 58000.00);
        Carro c2 = new Carro("Honda", "HB20", 65000.00);
        Carro c3 = new Carro("BMW", "X1", 150000.00);
        Carro c4 = new Carro("Mercedes Benz", "C180", 159000.00);


        List<Carro> carros = Arrays.asList(c1, c2, c3, c4);

        double valor = 150000.0;

        Predicate<Carro> isExpensive= m -> m.preco >= valor;

        Function<Carro, String> par = m -> "Fabricante: " + m.fabricante + " - " + "Modelo: " + m.modelo + " - " + "Preço: " + m.preco;

        carros.stream().filter(isExpensive).map(par).forEach(System.out::println);





    }


}
