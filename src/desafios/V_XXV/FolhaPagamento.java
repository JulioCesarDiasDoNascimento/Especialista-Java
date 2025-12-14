package desafios.V_XXV;

public class FolhaPagamento {

    double salarioBruto;

    double calcularSalario(Holerite holerite, ContratoTrabalho contrato) {
     holerite.valorTotalDasHorasNormais = holerite.funcionario.quantidadeDeHorasNormais * contrato.valorHora;
     salarioBruto += holerite.valorTotalDasHorasNormais;
      if (holerite.funcionario.quantidadeDeHorasExtras > 0) {
        holerite.valorTotalDasHorasExtras = holerite.funcionario.quantidadeDeHorasExtras * contrato.valorHoraExtra;
        salarioBruto += holerite.valorTotalDasHorasExtras;
      }
      if (contrato.funcionarioComFilhos()){
        holerite.valorAdicionaisParaFilhos = salarioBruto * 0.10;
          salarioBruto +=  holerite.valorAdicionaisParaFilhos;
      }
      System.out.printf("O valor bruto a receber é: ", salarioBruto);
      return salarioBruto;
    }
}
