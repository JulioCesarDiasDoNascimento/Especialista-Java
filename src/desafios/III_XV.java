package desafios;

import java.util.Scanner;

public class III_XV {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do Empréstimo: ");
        double valorEmprestimo = entrada.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = entrada.nextInt();

        double taxaJuros = 0;

        switch (quantidadeParcelas){
            case 1, 2 -> taxaJuros = 1.99;
            case 3 -> taxaJuros = 2.99;
            default -> taxaJuros = 3.99;
        }

        double tarifaFixa = valorEmprestimo >= 100 ? 1.50 : 0 ;
        double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
        double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

        System.out.printf("Tarifa fixa: R$ %.2f%n", tarifaFixa);
        System.out.printf("Total juros: R$ %.2f%n", totalJuros);
        System.out.printf("Custo: R$ %.2f%n", custoTotal);
    }
}
