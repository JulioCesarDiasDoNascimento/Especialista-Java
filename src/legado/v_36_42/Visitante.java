package legado.v_36_42;

public class Visitante {

    static final int MAIOR_IDADE = 18; // isso é uma constante!
    String nome = "João";
    int idade;

    boolean possuiAcessoRegistroPorIdade(){
        return this .idade < MAIOR_IDADE;
    }
}
