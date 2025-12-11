package V;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.fabricante = "bmw";
        meuCarro.modelo = "x6";
        meuCarro.cor = "branca";
        meuCarro.anoFabricacao = 2025;

        Carro seuCarro  = new Carro();
        seuCarro.fabricante = "audi";
        seuCarro.modelo = "a8";
        seuCarro.cor = "preto";
        seuCarro.anoFabricacao = 2025;

        System.out.println(meuCarro.toString());
        System.out.println(seuCarro.toString());
    }
}
