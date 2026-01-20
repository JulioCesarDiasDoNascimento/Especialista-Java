package desafios.V_XLI;

public class Principal {
    static void main() {

        NumeroUtil numeroUtil = new NumeroUtil();
        var resultadoPrimeiroMetodo = numeroUtil.maiorNumero(0,0);
        System.out.println("O resultado do primeiro método é: " + resultadoPrimeiroMetodo);

        var resultadoSegundoMetodo = numeroUtil.maiorNumero(1,2,3);
        System.out.println("O resultado do segundo método é: " + resultadoSegundoMetodo);

        var resultadoTerceiroMetodo = numeroUtil.maiorNumero(1.5,2.5);
        System.out.println("O resultado do terceiro método é: " + resultadoTerceiroMetodo);

        var resultadoQuartoMetodo = numeroUtil.maiorNumero(1.9,2.1,3.4);
        System.out.println("O resultado do quarto método é: " + resultadoQuartoMetodo);
    }
}
