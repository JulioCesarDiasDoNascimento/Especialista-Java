package desafios.III;

import java.util.Scanner;

public class XV {
    // Class SimuladorEmpréstimo
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = entrada.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        /* 1 ou 2: 1,99% ao mês.
           3: 2,99 ao mês.
           Outras: 3,99
         */
        int quantidadeParcelas = entrada.nextInt();

        double taxasJuros = switch (quantidadeParcelas) {
            case 1, 2 -> 1.99;
            case 3 -> 2.99;
            default -> 3.99;
        };

        // Se valor do emprestimo for maior que 100 ele tem uma tarifa de 1,50
        double tarifaFixa = valorEmprestimo > 100 ? 1.50 : 0;

        double totalJuros = valorEmprestimo * (taxasJuros / 100 * quantidadeParcelas);
        double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

        System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
        System.out.printf("Total de juros: R$%.2f%n", totalJuros);
        System.out.printf("Custo total: R$%.2f%n", custoTotal);
    }
}
