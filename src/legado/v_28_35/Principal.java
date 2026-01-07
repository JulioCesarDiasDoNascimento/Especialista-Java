package legado.v_28_35;

public class Principal {
    public static void main(String[] args) {
        Produto soja = new Produto();
        soja.precoCusto = 250; // por enquanto não está a ser usado!
        soja.alterarPrecoCusto(100);
        Produto.alterarCustoEmbalagem(10);

        Produto carne = new Produto();
        carne.alterarPrecoCusto(100);

        System.out.printf("Total de custos da carne: %.2f%n", Produto.calcularCustosTotais(carne));


        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(soja, 20);
        Produto.imprimirCustoEmbalagem();

        System.out.printf("Preço de veda: %.2f%n", soja.precoVenda);

    }
}
