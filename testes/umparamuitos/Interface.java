package testes.umparamuitos;

public class Interface {
    public static void main(String[] args) {

        Motorista m1 = new Motorista("Walace", "123456");

        m1.adicionarVeiculos("XXX-XXX","VOLVO", 1978);
        m1.adicionarVeiculos("AAA-AAA","FERRARI", 1980);

        for(Veiculo veiculos: m1.veiculos) {
            System.out.println(veiculos.getPlaca() + " " + veiculos.getFabricante());


        }

        m1.removerVeiculos(0);

        for(Veiculo veiculos: m1.veiculos) {
            System.out.println(veiculos.getPlaca() + " " + veiculos.getFabricante());
            System.out.println();

        }


    }

}
