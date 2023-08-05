package controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número: ");

        int numero = Integer.parseInt(valor); //Convertendo String para Número Tipo Inteiro.

        if (numero % 2 == 0) {
            System.out.print("Número PAR!");

        } else {
            System.out.print("Número Impar!");
        }

    }
}
