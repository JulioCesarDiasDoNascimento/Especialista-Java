package legado.vii_04_05;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    static void mainOld() {
        int[] notas = {8, 5, 4, 9, 10};

        String notasString = Arrays.toString(notas);
        System.out.println(notasString);
    }

    static void main() {
        Integer[] notas = {8, 5, 4, 9, 10};

//      Arrays.sort(notas);
        Arrays.sort(notas, Comparator.reverseOrder());
        System.out.printf(Arrays.toString(notas));
    }
}
