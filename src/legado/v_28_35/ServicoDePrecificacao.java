package legado.v_28_35;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        double precoVendaCalculado = Matematica.calcularAcresimo(produto.precoCusto, percentualMargemLucro);
       precoVendaCalculado += Produto.custoEmbalagem;
       produto.precoVenda = precoVendaCalculado;

    }

}
