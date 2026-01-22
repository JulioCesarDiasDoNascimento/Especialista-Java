package legado.viii_01_02;

public class Principal {
    static void main() {
        // int [] notas = new int[5]; uma forma de fazer / seta os valores depois! (SEMPRE USAR ASSIM)
        int [] notas = new int [] {11, 5, 4, 9, 10};
        System.out.println(notas[0]);

        int totalDeNotas = notas[0] + notas[1] + notas[2]  + notas[3]  + notas[4];
        int mediaDeNotas = totalDeNotas/5;

        if(notas[0] > 10) {
            System.out.printf("A nota %d é muito alta %n", notas[0]);
        }
        else {
            System.out.println("A nota está certa");
        }
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        System.out.println(notas[4]);
        System.out.println(totalDeNotas);
        System.out.printf("A media das notas é: %d%n", mediaDeNotas);

    }
}
