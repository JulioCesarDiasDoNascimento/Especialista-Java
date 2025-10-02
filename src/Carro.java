public class Carro {
//Estudo basico de orientação a objetos.

//Não é preciso declarar a variável informando o tipo Ex: int corCarro;
//É uma classe para representar o tipo, não deve ter o método main.
//Declaração int ano, declaração mais atribuição é int ano = 2025;
/*Aqui são os atributos da variável de instancia. Também pode ser chamado de membros
    que podem ser tanto as variáveis como os métodos*/
//Lembrar ao atribuir valores as variáveis devem ser do tipo declarada.
/* Valores padrões :
* int = 0
* String = null (OBS: null é so para objetos)
* double = 0.0
* boolean = false */

    //Iniciar as caracteristicas do objeto = atributos.
    String fabricante;
    String modelo;
    String cor;
    double valor;
    int anoFabricacao;
    //Composição de objetos, é a relação tem UM.
    Pessoa proprietario;
//Pessoa proprietário = new Pessoa(); sempre instanciar o objeto na classe de declaração é errado.

    //Iniciar os comportamentos do objeto = métodos.
    //Assinatura do método (Retorno, nome e parâmetros).

    int calcularTempoUsoEmAnos() {
        return 2025 - anoFabricacao;
    }
    double calcularValorRevenda() {
         int vidaUtilAnos = 20;
         double valorRevenda = (valor / vidaUtilAnos) * (vidaUtilAnos - calcularTempoUsoEmAnos());

         if (valorRevenda < 0) {
             valorRevenda = valor;
         }
         return valorRevenda; // o return é o ultimo ponto de parada do método.
    }

    void imprimirResumoDepreciacao() {
        System.out.println("O carro " + fabricante + " " + modelo + " foi depreciado em " + calcularTempoUsoEmAnos()
                + " anos " + "" + "valor atual é: " + calcularValorRevenda() +" o valor do ipva anual é: " + calcularIpva());
    }

    double calcularIpva() {
        if (anoFabricacao < 2015){
            return 0.0;
        }
        return calcularValorRevenda() * 0.05;
    }



}
