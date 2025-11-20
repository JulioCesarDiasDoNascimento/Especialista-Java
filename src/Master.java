import java.util.Locale;
import java.util.Scanner;

public class Master {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite seu peso: ");
        int peso = entrada.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %f",imc);

        boolean abaixoPesoIdeal = imc < 18.5;

        if (abaixoPesoIdeal) {
            System.out.println("Abaixo do peso ideal.");
        }
    }
}
