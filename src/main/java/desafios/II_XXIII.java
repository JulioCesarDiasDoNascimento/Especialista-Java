package desafios;

import java.util.Scanner;

public class II_XXIII {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        double valorHora;
        int horasTrabalhadas;
        double valorDesconto;

        // Exemplo do PDF
        nome = entrada.nextLine(); // Thiago Farias
        horasTrabalhadas = entrada.nextInt(); // 172
        valorHora = entrada.nextDouble(); // 150,20
        valorDesconto = entrada.nextDouble(); //482,88

        double salario;
        salario = valorHora * horasTrabalhadas;

        double total = salario - valorDesconto;

        System.out.printf("Folha de pagamento: %s%n%d horas x R$%.2f = R$%.2f%nDescontos: R$%.2f%nTotal devido: R$%.2f",
                nome, horasTrabalhadas, valorHora, salario, valorDesconto, total);

    }
}
