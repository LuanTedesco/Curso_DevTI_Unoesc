Algoritmo "exercicio2"

Var
   numA: vetor[1..5] de inteiro
   numB: vetor[1..5] de inteiro
   iA: inteiro
   iB: inteiro

Inicio

   iB <- 5
   
   para iA de 1 ate 5 passo 1 faca
      escreva("Digite o", iA,"º numero: ")
      leia(numA[iA])

      numB[iB] <- numA[iA]
      iB <- iB - 1

   fimpara

   escreval("")

   para iB de 1 ate 5 passo 1 faca
      escreva(numB[iB])
   fimpara
   
Fimalgoritmo