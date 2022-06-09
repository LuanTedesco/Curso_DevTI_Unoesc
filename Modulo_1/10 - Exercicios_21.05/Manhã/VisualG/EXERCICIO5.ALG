Algoritmo "exercicio5"

Var

   num1: vetor[1..5] de inteiro
   num2: vetor[1..5] de inteiro
   num3: vetor[1..5] de inteiro
   i,soma: inteiro

Inicio

   para i de 1 ate 5 passo 1 faca
      escreval("Digite o", i,"º numero do primeiro vetor: ")
      leia(num1[i])
   fimpara
   
   limpatela

   para i de 1 ate 5 passo 1 faca
      escreval("Digite o", i,"º numero do segundo vetor: ")
      leia(num2[i])
   fimpara

   limpatela

   para i de 1 ate 5 passo 1 faca
      num3[i] <- (num1[i] + num2[i])
      escreval("A soma entre", num1[i], " e", num2[i]," é: ", num3[i])
   fimpara


Fimalgoritmo