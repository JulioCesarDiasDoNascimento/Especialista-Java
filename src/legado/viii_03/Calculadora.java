package legado.viii_03;

public class Calculadora {

    // Sempre entender bem o que é para ser feito
    static double calcularMedia(int[] numeros){
        int total = 0;
        // usando o fori!
        // se precisar de alguma observação é melhor usar esse for
        for(int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }
        return (double) total / numeros.length;
    }

    static double calcularMedia(double[] notas){
        int total = 0;
        // para iterar tudo
        for(double nota: notas){
            total += nota;
        }
        return (double) total / notas.length;
    }
}
