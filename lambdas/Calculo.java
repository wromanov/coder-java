package lambdas;

@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);


//Essa anotação "@FunctionalInterface" valida que trata-se de uma interface funcional e que pode ser implementado apenas um método.
//A partir das interfaces funcionais que serão criadas as funções do tipo lambdas (funções anonimas usadas dentro do código)
//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

/*Apesar de ser uma interface e permitir apenas um método abstrato ainda podemos utilizar
  "métodos defaults" e "métodos estáticos" dentro da interface, pois entende que só existe apenas
  um método abstrato dentro da interface sem implementação.*/

//Método default
default String legal() {
    return "Legal";
}

//Método estático
static String muitoLegal(){
    return "Muito legal";
}



}
