package v;

public class Produto {
    static double custoEmbalagem; // Elá pertence a classe produto!
    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto =  precoCusto;
    }

    void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }
}
