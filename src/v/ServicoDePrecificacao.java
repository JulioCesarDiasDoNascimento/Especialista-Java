package v;

public class ServicoDePrecificacao {
    // Esse codigo está errado, pois ele não altera o valor do parâmetro
    void calcularPrecoVenda(double precoCusto){
        // Adiciona 20% da margem
        precoCusto = precoCusto * 1.20;
    }
}
