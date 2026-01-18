package legado.vii_01;

public class PrincipalDOIS {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        int julioIdade = 22;
        cliente.idade = Integer.valueOf("22");

        System.out.printf("Idade: %d%n", cliente.idade);
    }
}
