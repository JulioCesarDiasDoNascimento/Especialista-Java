package v;

public class Principal {

    // a ideia é para um hospital kk
    static void main() {

        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Júlio";
        novoVisitante.idade = 12;

        CadastroPortaria novoCadastro = new CadastroPortaria();
        novoCadastro.cadastar(novoVisitante, 2);


        if (novoVisitante.possuiAcessoRegistroPorIdade()){
            System.out.printf("Acesso não permite para menores de %d anos", Visitante.MAIOR_IDADE);
        } else {
            System.out.println("Acesso liberado para: " + novoVisitante.nome);
        }

    }
}
