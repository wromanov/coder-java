package classe;

public class Data {
    int dia, mes, ano; //Atributos de Estância/Objeto


    //Construtor Padrão com valores padrões de inicialização
    Data() {
        //this.dia = 01;
        //this.mes = 01;
        //this.ano = 1970;
        this(1, 1, 1970); //Usando this para chamar outro um construtor dentro do construtor, o que diferencia um construtor do outro é a quantidade de parâmetros.

    }

    //Construtor personalizado - Construtores não recebem nenhum valor antes do nome, se colocar um valor antes do nome virá um método.
    Data(int dia, int mes, int ano) {
        this.dia = dia; //this é utilizado para resolver conflito de nome entre atributo de estância e parâmetro do construtor.
        this.mes = mes;
        this.ano = ano;
    }

    //Método de Estância
    String DataFormatada() {
        String formato = "%02d/%02d/%d %s\n"; //Variável local, só está disponível dentro do método "DataFormatada"
        return String.format(formato, dia, mes, ano, hora);
    }

    String hora = "13:00"; //Variável de Objeto, está disponível para todos utilizar e pode ser acessada por qualquer método de qualquer lugar.


}
