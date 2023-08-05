package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1 ou a += 1 -- Incremento Pos fixado, quer dizer que não tem pressa, será comparado o valor e depois realizado o incremento.
        a--; // a = a - 1 ou a -= 1 -- Decremento Pos fixado, quer dizer que não tem pressa, será comparado o valor e depois realizado o decremento.

        ++b; // b = b + 1 ou b += 1 -- Incremento Pre fixado, quer dizer que tem pressa, será incrementado o valor e depois realizado a comparação.
        --b; // b = b - 1 ou b -= 1 -- Decremento Pre fixado, quer dizer que tem pressa, será decrementado o valor e depois realizado a comparação.


        System.out.println(++a == b--); // será incrementado o valor na variável a e depois comparado com b, sem realizar o decremento, pois a variavel b está pos fixada.

    }

}
