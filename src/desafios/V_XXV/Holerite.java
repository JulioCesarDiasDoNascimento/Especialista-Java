package desafios.V_XXV;

public class Holerite {
    Funcionarios funcionario;
    double valorTotalDasHorasNormais;
    double valorTotalDasHorasExtras;
    double valorAdicionaisParaFilhos;

    double calcularValorTotalHolerite() {
        return valorTotalDasHorasNormais + valorTotalDasHorasExtras + valorAdicionaisParaFilhos;
    }

    void imprimirResumoHolerite() {
        System.out.printf("A holerite do funcionario %s desse mês, valor total de horas %.2f," +
                " valor total de extra %.2f" + " e valor pago aos filhos %.2f",
                funcionario.nome, valorTotalDasHorasNormais, valorTotalDasHorasExtras, valorAdicionaisParaFilhos);
    }

}
