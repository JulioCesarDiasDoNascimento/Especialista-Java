package desafios.V_VII;

public class Principal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Bob";
        meuCachorro.raca = "Pastor Alemão";
        meuCachorro.sexo = 'M';
        meuCachorro.idade = 3;

        Cachorro seuCachorro = new Cachorro();
        seuCachorro.nome = "Dora";
        seuCachorro.raca = "Salxixa";
        seuCachorro.sexo = 'F';
        seuCachorro.idade = 1;


        System.out.printf("O Cachorro Homem é chamado de %s, é da raça %s e do sexo %s e tem a idade %d%n",
                meuCachorro.nome, meuCachorro.raca, meuCachorro.sexo, meuCachorro.idade);

        System.out.printf("A Cachorra Mulher é chamado de %s, é da raça %s e do sexo %s e tem a idade %d",
                seuCachorro.nome, seuCachorro.raca, seuCachorro.sexo, seuCachorro.idade);

    }
}
