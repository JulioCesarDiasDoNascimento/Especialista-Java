package v;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;

    @Override
    public String toString() {
        return "A fabrica do carro é: " + fabricante + " do modelo: " + modelo + " da cor: " + cor
                + " é do ano de fabricação: " + anoFabricacao + " e o dono é " + proprietario.nome + " com cpf: "
                + proprietario.cpf + " nascendo em: " + proprietario.anoNascimento;
    }
}
