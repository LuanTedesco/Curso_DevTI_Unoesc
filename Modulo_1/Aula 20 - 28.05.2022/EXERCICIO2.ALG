Algoritmo "exercicio2"

Var
   ano, mes, dia, resultadoanos, resultadomeses, resultadosomadias: inteiro

funcao anostodias(x:inteiro):inteiro
var aux:inteiro
inicio
aux <- x*365
retorne aux
fimfuncao

funcao mesestodias(x:inteiro):inteiro
var aux:inteiro
inicio
aux <- x*30
retorne aux
fimfuncao

funcao somadias(x,y,z:inteiro):inteiro
var aux:inteiro
inicio
aux <- x+y+z
retorne aux
fimfuncao

Inicio

   escreval("Digite quantos anos você viveu: ")
   leia(ano)
   escreval("Digite quantos meses você viveu: ")
   leia(mes)
   escreval("Digite quantos dias você viveu: ")
   leia(dia)
   resultadoanos <- anostodias(ano)
   resultadomeses <- mesestodias(mes)
   resultadosomadias <- somadias(resultadoanos,resultadomeses,dia)
   limpatela
   escreval("Você viveu",resultadosomadias," dias")


Fimalgoritmo