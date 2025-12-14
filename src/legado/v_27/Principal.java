package legado.v_27;

public class Principal {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;
        aviaoGol.ativar();
        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponívei%n", aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());
    }
}
