Algoritmo "Exercício 9"

Var
   contador, numero, fatorial: inteiro

Inicio

   escreval("Digite um número maior que 0: ")
   leia(numero)

   fatorial <- 1
   contador <- numero
   enquanto contador >= 1 faca
      fatorial <- fatorial * contador
      contador <- contador-1
   fimenquanto

   escreval("O fatorial de",numero," é",fatorial)

Fimalgoritmo
