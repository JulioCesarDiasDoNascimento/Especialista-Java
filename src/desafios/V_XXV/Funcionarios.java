package desafios.V_XXV;

import java.util.Scanner;

public class Funcionarios {

    String nome;
    int quantidadeDeFilhos;
    int quantidadeDeHorasExtras;
    int quantidadeDeHorasNormais;

    int quantidadeDeFilho() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de filhos: ");
        quantidadeDeFilhos = entrada.nextInt();
        return quantidadeDeFilhos;
    }
}
