package desafios.VII_V;

public class Principal {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
    // Não deveria mudar o volume e canal
        tv.mudarVolume(1);
        tv.mudarCanal(1);
    // Deveria mudar o volume e canal
        tv.mudarVolume(10);
        tv.mudarCanal(2);
    }
}
