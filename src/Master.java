import java.util.Scanner;

public class Master {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a avalição do funcionario: ");
        int nota = entrada.nextInt(); // vai de 1 a 5
        String descricaoNota = null;

        switch (nota) {
            case 1:
                descricaoNota = "Muito Ruim";
                break;
            case 2:
                descricaoNota = "Ruim";
                break;
            case 3:
                descricaoNota = "Regular";
                break;
            case 4:
                descricaoNota = "Bom";
                break;
            case 5:
                descricaoNota = "Excelente";
                break;
        }
        System.out.printf("A avaliação do funcionario foi: %s%n",descricaoNota);
    }
}
