package desafios.V_XXV;

public class Principal {
    public static void main(String[] args) {

        Funcionarios julio = new Funcionarios();
        julio.nome = "Julio";
        julio.quantidadeDeFilhos = 2;
        julio.quantidadeDeHorasNormais = 40;
        julio.quantidadeDeHorasExtras = 10;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.valorHora = 40;
        contratoTrabalho.valorHoraExtra = 10;
        contratoTrabalho.funcionario = julio;

        Holerite holerite = new Holerite();
        holerite.funcionario = julio;
        holerite.calcularValorTotalHolerite();


        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.calcularSalario(holerite, contratoTrabalho);
        holerite.imprimirResumoHolerite();

    }
}
