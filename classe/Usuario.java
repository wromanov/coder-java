package classe;

public class Usuario {
    String nome;
    String email;


    //Construindo Equals | O Equals também pode ser gerado automaticamente pela IDE.
    @Override
    //Object é a classe main do java, é o objeto mais genérico em java.
    public boolean equals(Object objeto) {

        //Verificar se o objeto passado como parâmetro é uma instância de "Usuário"
        if (objeto instanceof Usuario) {

            //Faz um casting do parâmetro recebido "objeto" para objeto do tipo usuário e atribui a variável outro.
            Usuario outro = (Usuario) objeto;

            //Compara o atributo "nome" do objeto o qual chamou o equals, em relação ao atributo "nome" do objeto passado como parâmetro.
            boolean nomeIgual = this.nome.equals(outro.nome);
            boolean emailIgual = this.email.equals(outro.email);

            //Verifica se "nomeIgual" é verdadeiro e "emailIgual" também é verdadeiro.
            return nomeIgual && emailIgual;
        }
        else {
            return false;
        }
    }

}

