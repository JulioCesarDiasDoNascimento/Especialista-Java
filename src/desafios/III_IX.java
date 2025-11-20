package desafios;

import java.util.Scanner;

public class III_IX {
    // Calcular o IMC de uma pessoa.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        int peso = entrada.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %f",imc);

        System.out.println("Digite seu sexo F ou M:");
        char seuSexo = entrada.next().charAt(0);


        boolean abaixoDoPesoMulher = imc < 19.5 && seuSexo == 'F';
        boolean abaixoDoPesoHomen = imc < 20.7 && seuSexo == 'M';
        boolean pesoIdealMulher = imc >= 19.1 && imc <= 25.8 && seuSexo == 'F';
        boolean pesoIdealHomen = imc >= 20.8 && imc <= 26.4 && seuSexo == 'M';
        boolean umPoucoAcimaDoPesoMulher = imc >= 25.9 && imc <= 27.3 && seuSexo == 'F';
        boolean umPoucoAcimaDoPesoHomen = imc >= 27.4 && imc <= 32.3 && seuSexo == 'M';
        boolean obesoMulher = imc > 32.3 && seuSexo == 'F';
        boolean obesoHomen = imc >= 31.1 && seuSexo == 'M';

        if (abaixoDoPesoMulher) {
            System.out.println("Abaixo do peso ideal para mulher.");
        } else if (abaixoDoPesoHomen) {
            System.out.println("Abaixo do peso ideal para homens.");
        } else if (pesoIdealMulher) {
            System.out.println("Peso ideal para mulher.");
        } else if (pesoIdealHomen) {
            System.out.println("Peso ideal para homem.");
        } else if (umPoucoAcimaDoPesoMulher) {
            System.out.println("Um pouco acima do peso ideal para mulher.");
        } else if (umPoucoAcimaDoPesoHomen) {
            System.out.println("Um pouco acima do peso ideal para homem");
        } else if (obesoMulher) {
            System.out.println("Obeso para mulher.");
        } else if (obesoHomen) {
            System.out.println("Obeso para homens.");
        }
    }
}
