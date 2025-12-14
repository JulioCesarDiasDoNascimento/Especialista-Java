package desafios.V_XXV;

public class ContratoTrabalho {
    Funcionarios funcionario;
    double valorHora;
    double valorHoraExtra;

    boolean funcionarioComFilhos() {
        return funcionario.quantidadeDeFilhos >= 1;
    }
}
