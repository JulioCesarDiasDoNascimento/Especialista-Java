package desafios.VII_V;

public class Televisor {
    // Segundo a intel o canal 1 é dedicado a configurações organizacionais.
    static Integer CANAL_PADRAO = 1;
    // Segundo a intel o volume 1 é o volume padrão
    static Integer VOLUME_PADRAO = 1;

    void mudarCanal(Integer novoCanal) {
        if (CANAL_PADRAO.equals(novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            CANAL_PADRAO = novoCanal;
            System.out.println("Canal alterado para " + CANAL_PADRAO);
        }
    }
    void mudarVolume(Integer novoVolume) {
        if (novoVolume.equals(VOLUME_PADRAO)) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            VOLUME_PADRAO = novoVolume;
            System.out.println("Volume alterado para " + novoVolume);
        }
    }
}
