package desafios.III;

import java.util.Scanner;

public class IV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano = 0;

        System.out.printf("Informe o ano que queira saber se é bissexto: %d%n", ano);

        ano = entrada.nextInt();
        boolean bissextos = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;

        System.out.printf("O ano é bissexto: %b", bissextos);
    }
}
