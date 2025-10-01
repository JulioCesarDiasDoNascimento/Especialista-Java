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
//Pessoa proprietario = new Pessoa(); sempre instanciar o objeto na classe de declaração é errado.

    //Iniciar os comportamentos do objeto = métodos.
    void calcularValorRevenda() {
         int tempoUsoAnos = 2025 - anoFabricacao;
         int vidaUtilAnos = 20;
         double valorRevenda = (valor / vidaUtilAnos) * (vidaUtilAnos - tempoUsoAnos);

         if (valorRevenda < 0) {
             valorRevenda = 0;
         }
         System.out.println("Tempo de uso: " + tempoUsoAnos);
         System.out.println("Valor da revenda: " + valorRevenda);
    }
}
