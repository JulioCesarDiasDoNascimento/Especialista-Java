package v;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estacomObesidade() {
        return resultado >= 30;
    }
    boolean estaAbaixoDoPesoIdeal() {
        return resultado < 18.5;
    }
}
