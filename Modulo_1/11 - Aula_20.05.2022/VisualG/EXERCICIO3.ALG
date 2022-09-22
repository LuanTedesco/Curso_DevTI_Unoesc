Algoritmo "exercicio3"

Var
   num: vetor[1..10] de inteiro
   i, maior, menor: inteiro


Inicio

 menor <- 1

   para i de 1 ate 10 faca
      escreval("Digite o numero ", i,": ")
      leia(num[i])
      se num[i] > maior entao
         maior <- num[i]
      fimse
      se num[i] < menor entao
         menor <- num[i]
      fimse
   fimpara

   escreval("O maior numero é: ", maior)
   escreval("O menor numero é: ", menor)


Fimalgoritmo