# Anotações

> Operadores de igualdade e negação
> * == igualdade
> * ! diferente

> Operadores de comparação
> * "> maior que"
> * "< menor que"
> * ">= maior ou igual a"
> * "<= menor ou igual a"

> Operadores 
> * Curto-circuito (é validado apenas o primeiro valor exemplo: 10 > 5 && 10 > 1 sé o 10 > 5 for falso ele não avalia o resto)
> * Precendência: o && é avaliado antes do || usar bem os parenteses()
> * && e 
> * || ou
> * ! NOT (diferente)

## Estrutura condicional if

> if(condição) {execulta sé for verdadeiro}
> * esle execulta se o if não for verdadeiro
> * as chaves no if é opcional (Porem pode gerar erros, pos ele pula a primeira linha)
> * else if para varias consultas;

> Escopos e inicialização
> * Se a variavel for declarada dentro de algum bloco ela só existe nele;

## Estrutura de controle switch

> È usado para o valor de uma unica coindição
> * switch (condição tipo nota é a variavel que vai ter alguma ação) {case 1: execulta}
> * tipo long não funciona
> * enum, string, int, char, byte funciona nesse caso
> * break é usado para sair do switch(obrigatorio ter)
> * default é usado quando nenhum case for verdadeiro

![img](img/switch.png)


> Switch Expressions
> * Java 14(17)
> * rotulos de flexa case "A", "B" -> print "Ola mundo" não precisa de break
> * expression = a logica do switch é atribuida a uma variavel
> * depois da -> é apenas o valor que vai ser atribuido a variavel
> * é obrigatorio ter o default
