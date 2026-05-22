package desafios;

public class II_XVIII {
    public static void main(String[] args) {
        int idade1 = 30;
        int idade2 = 40;
        // int idade3 = 60;
        float idade3 = 60;

        //float idadeMedia =(float) (idade1 + idade2 + idade3) / 3; - usando casting
        float idadeMedia = (idade1 + idade2 + idade3) / 3; // - usando promoção aritmética
        System.out.println("Idade média é: " + idadeMedia);
    }
}
