package v;

public class Principal {
    public static void main(String[] args) {
        Produto soja = new Produto();
        Produto.custoEmbalagem = 10;
        soja.precoCusto = 250; // por enquanto não está a ser usado!
        soja.alterarPrecoCusto(100);


        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(soja, 20);

        System.out.printf("Preço de veda: %.2f%n", soja.precoVenda);

    }
}
