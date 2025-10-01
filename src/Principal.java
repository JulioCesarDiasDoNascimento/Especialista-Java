public class Principal {

    public static void main(String[] args){

        //Sempre lembrar que para usar um objeto ele precisa estar instanciado = existir.

        //criando um objeto da classe Carro, é um objeto único.
        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "Civic";
        meuCarro.cor = "Branco";
        meuCarro.anoFabricacao = 2015;
        meuCarro.valor = 120000.00;
        //Aqui gera uma exceção nullPointerException, Resolvido: Instanciando uma pessoa, tem que existir a pessoa.
        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "Julio";
        meuCarro.proprietario.cpf = "123.456.789-08";
        meuCarro.proprietario.anoNascimento = 2003;

        //Outra forma de criar esse proprietario, é criando o objeto da pessoa é so atribuir a variavel proprietario.
        //As vezes é melhor instanciar de forma separada e depois atribuir.
        Pessoa julio = new Pessoa();
        julio.nome = "Julio";
        julio.cpf = "123.456.789-00";
        julio.anoNascimento = 2003;
        meuCarro.proprietario = julio;

        //Isso é uma pilha de métodos, o main chama o calcularValorRevenda.
        meuCarro.calcularValorRevenda();

        //É um objeto diferente do de cima, cada objeto é único, faz referência ao um objeto diferente na memória.
        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Toyota";
        seuCarro.modelo = "Corolla";
        seuCarro.cor = "Branco";
        seuCarro.anoFabricacao = 2025;
        seuCarro.proprietario = new Pessoa();
        seuCarro.proprietario.nome = "Alex";
        seuCarro.proprietario.cpf = "123.456.789-00";
        seuCarro.proprietario.anoNascimento = 1984;
        seuCarro.calcularValorRevenda(); //chamada do método calcularValorRevenda.

        /* Variável: meuCarro, seuCarro e julio, ela não representa o objeto e sim faz referência ao objeto,
        * então ela não armazena valor.
        * O objeto é único*/

    }
}
