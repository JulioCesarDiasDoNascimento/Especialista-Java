package V;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;

    @Override
    public String toString() {
        return "A fabrica do carro é: " + fabricante + " do modelo: " + modelo + " da cor: " + cor
                + " é do ano de fabricacao: " + anoFabricacao;
    }
}
