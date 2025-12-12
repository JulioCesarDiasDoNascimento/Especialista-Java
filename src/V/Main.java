package V;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        Pessoa eu = new Pessoa();
        eu.nome = "Júlio";
        eu.cpf = "111.222.333-44";
        eu.anoNascimento = 2003;

        Pessoa gi = new Pessoa();
        gi.nome = "Giovanna";
        gi.cpf = "222.222.333-66";
        gi.anoNascimento = 2006;

        meuCarro.fabricante = "bmw";
        meuCarro.modelo = "x6";
        meuCarro.cor = "branca";
        meuCarro.anoFabricacao = 2025;
        meuCarro.proprietario = eu;

        Carro seuCarro  = new Carro();
        seuCarro.fabricante = "audi";
        seuCarro.modelo = "a8";
        seuCarro.cor = "preto";
        seuCarro.anoFabricacao = 2025;
        seuCarro.proprietario = gi;

        System.out.println(meuCarro.toString());
        System.out.println(seuCarro.toString());
    }
}
