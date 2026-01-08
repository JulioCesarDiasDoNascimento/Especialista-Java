# Anotações

* **classes** - objeto
* **atributos** - características do objeto
* **métodos** - comportamento do objeto
---

> Uma classe após criada também vira um tipo!
> ---

> A classe é apenas um molde, o objeto é criado no new!
> ---

### Os atributos declarados na classe, também é chamado membros das classes
![membros das classes](../img/membrosdaclasse.png)
---
#### Composição de objetos
* Um objeto composto pelo outro(isso é muito usado)

### Valores Padrões

> Tipos primitivos 
> * int = 0
> * char = ''
> * double = 0
> * boolean = false

> Classes = null
>----


### MUITO IMPORTANTE!
#### A variavel ela não é um objeto, ela apenas faz referência a um!
![referencia ao objeto pessoa](../img/referencia_objeto.png)
* Variável referência ao objeto é um apontamento ao objeto 

 **SUPERENTENDIDO AGORA**
----

> Métodos
> * para nomes de métodos sempre utilizar um verbo no infinitivo!
> * **assinatura do método é onde ele é declarado! TIPO NOME() {**
> * a variável alocada no parâmetro so existe dentro do bloco!
> * quando informamos que o método tem parâmetros é obrigatório implementar eles!
> * evitar alterar valor de variável recebida pelo parâmetro aula 05.28


### this
* informa que o atributo é da classe.

> **static**
> * informa que a variável não é da instância e sim da classe
> * global, todas as "instancias recebem o mesmo valor"
> * não gostei muito de usar!
> * não faz parte do objeto e sim da classe
> * método de instância não é par alterar o valor de uma variável estática 
> * de instância vs da classe(static)
> * de instância só pode ser acessado quando instanciamos o objeto = new Objeto.
> * Da classe acessamos quando chamamos a classe Obejeto.membro


* Chegou um ponto importante, atributos e métodos staticos devem ser usado em classes utils | helper
* Deve se evitar criar métodos staticos, pois não é tão orientado a objetos

> * this não pode ser usado em métodos staticos
> * se por acaso eu precisar receber um atributo estático num método statico devo passa lo como parâmetro
o objeto e utilizar no código


> * static final int maiorIdade = 18; // isso é uma constante!
> * OBSERVAÇÃO ESSE VALOR NÃO SE ALTERA.
> * padão para declarar constantes seria assim
    **static final int MAIOR_IDADE = 18;**
---

### Sobrecarga de métodos
* para utilizar sobrecarga precisa ter o mesmo nome o método
* os parâmetros têm que ser diferente

> **Inferência** = deduzir
> * o compilador se vira
> * var = no lugar do tipo 
> * OBS. EU JÚLIO CÉSAR NÃO GOSTO MUITO DE USAR, PREFIRO TUDO SER TIPADO
> * não funciona em variavel de instância, apenas em variavel local(dentro de algum método)
> * não é muito usado no mercado de java