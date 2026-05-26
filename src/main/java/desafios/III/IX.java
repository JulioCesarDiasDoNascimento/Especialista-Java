package desafios.III;

import java.util.Scanner;

public class IX {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu sexo com f(para mulheres) ou m(para homens): ");
        char sexo = entrada.next().charAt(0);
        System.out.println("----------------------------------------------------");

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("----------------------------------------------------");


        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("----------------------------------------------------");

        double imcMasculino = peso / (altura * altura);
        double imcFeminino = peso / (altura * altura);


        // condição para IMC em homens
        if (sexo == 'm'){
            // Abaixo do peso
            if (imcMasculino < 20.7){
                System.out.println("Você está com peso abaixo do ideal");
            } else if (imcMasculino > 20.8 && imcMasculino < 26.4){
                System.out.println("Você está no peso ideal");
            } else if (imcMasculino > 26.5 && imcMasculino < 31.1){
                System.out.println("Você está acima do peso ideal");
            } else if (imcMasculino > 31.1){
                System.out.println("Voce está Obeso");
            }
        }

        // condição para IMC em mulheres
        if (sexo == 'f'){
            // Abaixo do peso
            if (imcFeminino < 19.1){
                System.out.println("Você está com peso abaixo do ideal");
            } else if (imcFeminino > 19.1 && imcFeminino < 25.8){
                System.out.println("Você está no peso ideal");
            } else if (imcFeminino > 25.9 && imcFeminino < 32.3){
                System.out.println("Você está acima do peso ideal");
            } else if (imcFeminino > 32.3){
                System.out.println("Voce está Obeso");
            }
        }
    }
}
