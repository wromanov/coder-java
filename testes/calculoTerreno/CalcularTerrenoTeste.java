package testes.calculoTerreno;
/* Programa destinado a calcula a área de um terreno irregular com 45 lados diferentes */

public class CalcularTerrenoTeste {
    public static void main(String[] args) {

        //Estanciando Objetos
        CalcularTerreno areaGeralTerreno = new CalcularTerreno(10, 15,36,22);
        CalcularTerreno walaceTerreno = new CalcularTerreno(14,15,17,10);
        CalcularTerreno janainaTerreno = new CalcularTerreno(10,14,19,12);


        //Método 1 - Utilizando Método Estático
        System.out.println("Medida Total Terreno Walace: " + CalcularTerreno.CalculoTerroIrregular(walaceTerreno) + " M");
        System.out.println("Medida Total Terreno Janaina: " + CalcularTerreno.CalculoTerroIrregular(janainaTerreno) + " M");
        System.out.println("Medida Total Terreno: " + CalcularTerreno.CalculoTerroIrregular(areaGeralTerreno) + " M");

        //System.out.println();

        //Método - Utilizando Método Publico da Classe a partir de um atributo.
        System.out.println("Medida Total Terreno Walace: " + walaceTerreno.CalculoTerroIrregular2());
        System.out.println("Medida Total Terreno Janaina: " + janainaTerreno.CalculoTerroIrregular2());
        System.out.println("Medida Total Terreno: " + areaGeralTerreno.CalculoTerroIrregular2());


    }
}
