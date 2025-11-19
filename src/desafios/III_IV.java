package desafios;

import java.util.Scanner;

public class III_IV {
    public static void main(String[] args) {

        Scanner anoPesquisa = new Scanner(System.in);
        System.out.print("Digite um ano: ");

        int ano = anoPesquisa.nextInt();
        boolean bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);

        if (bissexto) {
            System.out.printf("%d é um ano bissexto.",ano);
        } else {
            System.out.printf("%d não é um ano bissexto.",ano);
        }

    }
}
