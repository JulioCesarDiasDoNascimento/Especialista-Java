package legado.viii_03;

public class Principal {
    static int MEDIA_ESTUDANTIL = 7;
    // iterar!
    public static void main(String[] args) {
        int[] notaJulio = {8,9,2,10};
        double[] notaGiovanna = {10,4,7,7};

       double mediaJulio =  Calculadora.calcularMedia(notaJulio);
       double mediaGiovanna = Calculadora.calcularMedia(notaGiovanna);
        System.out.printf("Media de Júlio: %.2f%n", mediaJulio);
        System.out.printf("Media de Giovanna: %.2f%n", mediaGiovanna);

        if (mediaJulio >= MEDIA_ESTUDANTIL ){
            System.out.println("Júlio foi aprovado");
        } else {
            System.out.println("Júlio foi reprovado");
        }
        if (mediaGiovanna >= MEDIA_ESTUDANTIL ){
            System.out.println("Giovanna foi aprovada");
        } else {
            System.out.println("Giovanna foi reprovada");
        }
    }
}
