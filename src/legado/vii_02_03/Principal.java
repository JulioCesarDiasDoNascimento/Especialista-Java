package legado.vii_02_03;

public class Principal {
    int idade = 20;
    short idadeShort = (short) idade;

    Integer diasEntrega = Integer.valueOf("30");
    // aqui na linha 9,10 eu estou fazendo o casting para short e long!
    short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());
    Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());

    Double valorTotal = Double.valueOf("1500.2");
    int valorTotalInt = valorTotal.intValue();
    // FIM da 07.02!

    public static void main(String[] args) {
        Integer diasEntrega = 30; // autoboxing, não precisa declarar o valueOf, ele converte automaticamente

        int diasEntregaInt = diasEntrega.intValue(); // unboxing ⇾ também não é mais preciso
        int diasEntregaInt2 = diasEntregaInt; // Modo certo

        System.out.println(diasEntregaInt);
        System.out.println(diasEntregaInt2);
        System.out.println(diasEntrega);
    }
}
