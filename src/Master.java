public class Master {

    public static void main(String[] args) {

        char tipoNotaFiscal = 'p'; // p - produto, s - serviço
        double totalFaturado = 1200.30;


        double valorImpostos;

        // COM OPERADOR TERNARIO
        // valorImpostos =  tipoNotaFiscal == 's' ? totalFaturado * 0.16 : totalFaturado * 0.35;

        if (tipoNotaFiscal == 's') {
            valorImpostos = totalFaturado * 0.16;
        } else {
            valorImpostos = totalFaturado * 0.35;
        }

        System.out.printf("Total faturado: R$ %.2f%n", totalFaturado);
        System.out.printf("Valor do impostos: R$ %.2f%n", valorImpostos);
        System.out.printf("Tipo da nota fiscal é %s%n", tipoNotaFiscal);
    }
}
