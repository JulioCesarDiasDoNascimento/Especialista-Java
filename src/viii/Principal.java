package viii;

public class Principal {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Aluno julio = new Aluno();
        Aluno maria = new Aluno();
        Aluno gabi = new Aluno();

        julio.idade = 22;
        julio.nome = "Julio";

        maria.idade = 23;
        maria.nome = "Maria";

        gabi.idade = 17;
        gabi.nome = "Gabi";

        turma.identificacao = "Maternal B";
        turma.nomeProfessor = "Tia Giovanna";
        turma.alunos = new Aluno[3];
        turma.alunos[0] = julio;
        turma.alunos[1] = maria;
        turma.alunos[2] = gabi;


        // outra forma

        turma.alunos[0].nome = "João";
        turma.alunos[1].nome = "Maria";

        for (int i = 0; i < turma.alunos.length; i++) {
            System.out.printf("O aluno do código %d do nome %s da idade %d%n",
                    i, turma.alunos[i].nome, turma.alunos[i].idade);
        }

        for (Aluno aluno : turma.alunos) {
            System.out.printf("O aluno do nome %s da idade %d%n",
                    aluno.nome, aluno.idade);
        }
    }
}
