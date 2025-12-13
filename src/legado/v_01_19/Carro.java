package legado.v_01_19;

import java.time.LocalDate;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;
    double precoCompra;

    double calcularValorRevenda() {
        int vidaUtilEmAnos = 20;
        double valorReveda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoUsoEmAnos());

        if (valorReveda < 0) {
            valorReveda = 0;
        }

        return valorReveda;
    }

    void imprimirResumoDeprecicao() {
        System.out.printf("Tempo de uso (anos): %d%n", tempoUsoEmAnos());
        System.out.printf("Valor da revenda: R$ %.2f%n", calcularValorRevenda());
    }

    int tempoUsoEmAnos() {
        return LocalDate.now().getYear() - anoFabricacao;
    }

    @Override
    public String toString() {
        return "A fabrica do carro é: " + fabricante + " do modelo: " + modelo + " da cor: " + cor
                + " é do ano de fabricação: " + anoFabricacao + " e o dono é " + proprietario.nome + " com cpf: "
                + proprietario.cpf + " nascendo em: " + proprietario.anoNascimento;
    }
}
