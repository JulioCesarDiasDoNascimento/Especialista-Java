package legado.v_36_42;

public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_PADRAO = 1;

    void cadastar(Visitante visitante, final int tempoExpiracao) {
        final int tempoExpiracaoEmDias; // aqui ela vai ser atribuída algum valor apenas 1 vez!
        tempoExpiracaoEmDias = tempoExpiracao * 30;

        System.out.printf("Visitante %s castrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);
    }

    void cadastar(final Visitante visitante) {
        this.cadastar(visitante, TEMPO_EXPIRACAO_PADRAO);
    }
}
