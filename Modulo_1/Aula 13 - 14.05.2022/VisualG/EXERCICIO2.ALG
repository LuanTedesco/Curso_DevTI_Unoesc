Algoritmo "exercicio2"

Var
   codigo: inteiro


Inicio
   escreva("Escreva o código do produto: ")
   leia(codigo)

   escolha codigo
   caso 1
      escreval("Alimento não-perecível")
   caso 2,3,4
      escreval("Alimento perecível")
   caso 5,6
      escreval("Vestiário")
   caso 7
      escreval("Higiene Pessoal")
   caso 8 até 15
      escreval("Limpeza e Utílitários Domésticos")
   outrocaso
      escreval("Código inválido")
   fimescolha


Fimalgoritmo