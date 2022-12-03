Algoritmo "exercicio3"

Var
   idade: inteiro
   resultado: caracter
   
funcao calculo(x:inteiro):caracter
var aux:caracter
inicio

escolha x
caso 0 ate 4
aux <- ("Menor que 5 anos")
caso 5 ate 7
aux <- ("Infantil A")
caso 8 ate 10
aux <- ("Infantil B")
caso 11 ate 13
aux <- ("Juvenil A")
caso 14 ate 17
aux <- ("Juvenil B")
caso 18 ate 1000
aux <- ("Adulto")
fimescolha

retorne aux
fimfuncao



Inicio

   escreval("Digite a sua idade nadador: ")
   leia(idade)
   
   resultado <- calculo(idade)
   
   escreval(resultado)



Fimalgoritmo