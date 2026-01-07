package v;

public class CadastroPortaria {

    void cadastar(Visitante visitante, final int tempoExpiracao) {
        final int tempoExpiracaoEmDias; // aqui ela vai ser atribuída algum valor apenas 1 vez!
        tempoExpiracaoEmDias = tempoExpiracao * 30;

        System.out.printf("Visitante %s caastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);
    }
}
