# Anotações

### Comentarios:
> // comentario de uma linha

> */ */ comentario de multiplas linhas

### Convenções de codigo:

> Junto-ao-parametro() Longe-da-chave {}

* Nome da classe deve comecar com letra maiuscula.
* Nome dos metodos deve comecar com letra minuscula.
* Nome das variaveis deve comecar com letra minuscula.
* Uma variavel de ser declarado por linha
* O padrão de nome de método e variavel é lowerCamelCase.

### Palavras reservadas:
![palavras resevadas.png](/img/palavras%20resevadas.png)
* Não pode ser usado como nome de variavel ou de metodo.
* Ser usada errada gera erro de compilação.

### Variaveis:
> Tipo nomeVariavel = valor;

* Tipo nome = valor (Declaração) o valor já pode ser passado aqui;
* nome = valor (Atribuição, para atribuir precisa existir uma declaração)

### Operadores aritmeticos:
* Adição + 
* Subtração -
* Multiplicação *
* Divisão /
* Resto da divisão %
* Incremento ++
* Decremento --

> Abreviando os operadores:
> * (Abreviação é +=, -=, *=, /=, %=)
> * Exemplo: 
> * * x += 2; 
> * * (equivale a x = x + 2;)

### Incremento e Decremento(Sempre é uma unica unidade):
> No lugar de usar x += 1;
> * podemos usar x++;


### Tipos primitivos:
![img](/img/tipos_primitivos.png)

number: int, float, double, long, byte, short
boolean: true, false
char: 'a', 'b', 'c'


### Conversão de tipos:(casting)
* Explicito:> long x = 10;
> int y = (int) x;

* Implicito:
> int x = 10;
> long y = x;
> ![img](/img/casting.png)

## Promoção aritmética
* Sempre vai ser exigido o resultado ao tipo maior!
* Exemplo: 
> int x = 10;
> long z = 5;
> long y = x * z; (MODO CERTO)