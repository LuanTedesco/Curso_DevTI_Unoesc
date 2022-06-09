Algoritmo "exercicio2"
//Faça uma função que recebe um valor inteiro
//e verifica se o valor é positivo ou negativo.
//A função deve retornar um valor booleano.
Var
   num: inteiro
   resposta: logico

funcao pn(x:inteiro): logico
var aux: logico
inicio
   se x > 0 entao
      aux <- verdadeiro
   senao se x < 0 entao
      aux <- falso
   fimse
retorne aux
fimfuncao



Inicio

escreval("O numero digitado é positivo? ")
leia(num)

resposta <- pn(num)

escreval(resposta)





Fimalgoritmo