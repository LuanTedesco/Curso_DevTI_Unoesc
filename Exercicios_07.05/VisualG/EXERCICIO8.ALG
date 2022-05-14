Algoritmo "Exercício 8"

Var
   contador: inteiro
   numero, soma, media: real

Inicio

   escreval("Digite um número: ")
   leia(numero)

   contador <- 0
   enquanto numero <> 0 faca
      contador <- contador+1
      soma <- soma + numero
      escreval("Digite um número: ")
      leia(numero)
   fimenquanto

   media <- soma/contador
   escreval("Foram digitados",contador," números")
   escreval("A média dos números digitados é:",media)

Fimalgoritmo
