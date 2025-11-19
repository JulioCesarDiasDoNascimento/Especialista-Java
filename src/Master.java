import java.util.Scanner;

public class Master {

    public static void main(String[] args) {
        // Exame cortisol
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu cortisol: ");
        double cortisol = entrada.nextDouble();
        // Cortisol ideal é 6 a 18.4
        boolean cortisolIdeal = cortisol >= 6 && cortisol <= 18.4;

        if (cortisolIdeal) {
            System.out.printf("O cortisol %f está  dentro do ideal!", cortisol);
        } else {
            System.out.printf("O cortisol %f está fora do ideal!", cortisol);
        }

    }
}
