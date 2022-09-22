Algoritmo "exercicio5"

Var
   valA: vetor[1..3,1..3] de inteiro
   valB: vetor[1..3,1..3] de inteiro
   valC: vetor[1..3,1..3] de inteiro
   l, c, soma: inteiro

Inicio

   para l de 1 ate 3 passo 1 faca
      para c de 1 ate 3 passo 1 faca
         escreva("Digite o numero da", c,"ª coluna e ", l, "ª linha: ")
         leia(valA[l,c])
      fimpara
   fimpara

   para l de 1 ate 3 passo 1 faca
      escreval("")
      para c de 1 ate 3 passo 1 faca
         escreva(valA[l,c])
      fimpara
   fimpara

   escreval("")

   para l de 1 ate 3 passo 1 faca
      para c de 1 ate 3 passo 1 faca
         escreva("Digite o numero da", c,"ª coluna e ", l, "ª linha: ")
         leia(valB[l,c])
      fimpara
   fimpara

   para l de 1 ate 3 passo 1 faca
      escreval("")
      para c de 1 ate 3 passo 1 faca
         escreva(valB[l,c])
      fimpara
   fimpara
   
   escreval("")

   para l de 1 ate 3 passo 1 faca
      para c de 1 ate 3 passo 1 faca
         valC[l,c] <- (valA[l,c] + valB[l,c])
      fimpara
   fimpara
   
   escreval("")

   para l de 1 ate 3 passo 1 faca
      escreval("")
      para c de 1 ate 3 passo 1 faca
         escreva(valC[l,c])
      fimpara
   fimpara




Fimalgoritmo