package desafios.XLI;

public class NumeroUtil {

    static int NUMERO_PADRAO = 0;
    int maiorNumero(int numeroUM, int numeroDOIS){
        if (numeroUM > numeroDOIS){
            return numeroUM;
        }else {
            return numeroDOIS;
        }
    }

    int maiorNumero(int numeroUM, int numeroDOIS, int numeroTRES){
        if (numeroUM > numeroDOIS && numeroUM > numeroTRES){
            return numeroUM;
        } else if (numeroDOIS > numeroUM && numeroDOIS > numeroTRES) {
            return numeroDOIS;
        } else if (numeroTRES > numeroUM && numeroTRES > numeroDOIS) {
            return numeroTRES;
        }
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
        return NUMERO_PADRAO;
    }

}
