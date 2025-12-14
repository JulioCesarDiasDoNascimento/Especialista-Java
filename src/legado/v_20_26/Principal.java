package legado.v_20_26;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        Paciente pacienteJulio = new Paciente();
        pacienteJulio.altura = 1.80;
        pacienteJulio.peso = 75;

        IndiceMassaCorporal imc = calculadoraImc.calcular(pacienteJulio);
        if (imc.estacomObesidade()){
            System.out.printf("Paciente com altura de %.2f e peso de %.2f está com obesidade%n", imc.altura, imc.peso);
        }
        System.out.printf("IMC: %.2f", imc.resultado);
    }
}
