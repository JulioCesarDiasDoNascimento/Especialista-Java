package legado.v_36_42;

public class Principal {

    // a ideia é para um hospital kk
    static void main() {

        var visitanteJulio = new Visitante();
        visitanteJulio.nome = "Júlio";
        visitanteJulio.idade = 12;

        var novoCadastro = new CadastroPortaria();
        novoCadastro.cadastar(visitanteJulio);


        if (visitanteJulio.possuiAcessoRegistroPorIdade()){
            System.out.printf("Acesso não permite para menores de %d anos", Visitante.MAIOR_IDADE);
        } else {
            System.out.println("Acesso liberado para: " + visitanteJulio.nome);
        }

    }
}
