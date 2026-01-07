package v;

public class Visitante {

    static final int MAIOR_IDADE = 18; // isso é uma constante!
    String nome;
    int idade;

    boolean possuiAcessoRegistroPorIdade(){
        return this .idade < MAIOR_IDADE;
    }
}
