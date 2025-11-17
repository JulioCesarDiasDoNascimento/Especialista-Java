package desafios;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class II_XXIII {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite as horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt(); // 172 horas no exemplo

        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = entrada.nextDouble(); // 150.20 reais no exemplo

        System.out.println("Digite o digite os descontos: ");
        double valorDesconto = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double totalDevido = salarioBruto - valorDesconto;
        System.out.println("Folha de Pagamento: " + nome +" " + horasTrabalhadas +"horas x " + "R$" + valorHora + " = " + salarioBruto + "" +
                " Descontos: " + valorDesconto + " Total devido: "+ "R$" + totalDevido );

    }


}
