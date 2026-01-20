package desafios.V_XLI;

public class NumeroUtil {

    static int NUMERO_PADRAO = 0;
    int maiorNumero(int numeroUM, int numeroDOIS){
        if (numeroUM > numeroDOIS){
            return numeroUM;
        }else if (numeroUM < numeroDOIS) {
            return numeroDOIS;
        }
        System.out.printf("O valor inserido é menor que o numero padrão: %d%n", NUMERO_PADRAO);
        return NUMERO_PADRAO;
    }

    int maiorNumero(int numeroUM, int numeroDOIS, int numeroTRES){
        if (numeroUM > numeroDOIS && numeroUM > numeroTRES){
            return numeroUM;
        } else if (numeroDOIS > numeroUM && numeroDOIS > numeroTRES) {
            return numeroDOIS;
        } else if (numeroTRES > numeroUM && numeroTRES > numeroDOIS) {
            return numeroTRES;
        }
        System.out.printf("O valor inserido é menor que o numero padrão: %d%n", NUMERO_PADRAO);
        return NUMERO_PADRAO;
    }

    int maiorNumero(double numeroUM, double numeroDOIS){
        if (numeroUM > numeroDOIS){
            return (int) numeroUM;
        }else
            return (int) numeroDOIS;
    }

    int maiorNumero(double numeroUM, double numeroDOIS, double numeroTRES) {
        if (numeroUM > numeroDOIS && numeroUM > numeroTRES) {
            return (int) numeroUM;
        } else if (numeroDOIS > numeroUM && numeroDOIS > numeroTRES) {
            return (int) numeroDOIS;
        } else if (numeroTRES > numeroUM && numeroTRES > numeroDOIS) {
            return (int) numeroTRES;
        }
        System.out.printf("O valor inserido é menor que o numero padrão: %d%n", NUMERO_PADRAO);
        return NUMERO_PADRAO;
    }

}
