public class Principal {

    public static void main(String[] args){

        //criando um objeto da classe Carro, é um objeto único.
        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "Civic";
        meuCarro.cor = "Branco";
        meuCarro.anoFabricacao = 2025;

        System.out.println("O fabricante do meu carro é " + meuCarro.fabricante);

        //é um objeto diferente do de cima, cada objeto é único, faz referência ao um objeto diferente na memória.
        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Toyota";
        seuCarro.modelo = "Corolla";
        seuCarro.cor = "Preta";
        seuCarro.anoFabricacao = 2025;


    }
}
