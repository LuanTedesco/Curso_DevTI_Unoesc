Algoritmo "exercicio4"

Var

   numA: vetor[1..10] de real
   numB: vetor[1..10] de inteiro
   par, impar, i: inteiro

Inicio

   //  par 0
   //  impar 1

   para i de 1 ate 10 passo 1 faca
      escreval("Digite o ",i,"º numero")
      leia(numA[i])
      numB[i] <- numA[i] mod 2
         se numB[i] = 0 entao
            numA[i] <- numA[i] / 2
         senao
            numA[i] <- numA[i] * 3
      fimse
   fimpara

   para i de 1 ate 10 passo 1 faca
      escreval(numA[i])
   fimpara



Fimalgoritmo