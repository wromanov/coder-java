package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primerio n�mero:");

        String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero:");

        System.out.println(valor1 + valor2);

        //Convertendo String para n�mero tipo Double, colocando a vari�vel dentro do wrapper double.
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println(soma);




    }
}
