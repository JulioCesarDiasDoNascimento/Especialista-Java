package v;

public class Principal {
    public static void main(String[] args) {
        Produto soja = new Produto();
        soja.precoCusto = 250; // por enquanto não está a ser usado!
        soja.alterarPrecoCusto(100);
        soja.alterarCustoEmbalagem(20);


        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(soja, 20);
        soja.imprimirCustoEmbalagem();

        System.out.printf("Preço de veda: %.2f%n", soja.precoVenda);

    }
}
