Algoritmo "exercicio4"

Var
   num: vetor[1..5] de inteiro
   i,resultadomaior,resultadomenor: inteiro

funcao maior:inteiro
var aux,i,j:inteiro
inicio

   para i de 1 ate 5 passo 1 faca
      para j de 1 ate 5 passo 1 faca
         se num[i] > num[j] entao
            aux <- num[i]
         fimse
      fimpara
   fimpara
   retorne aux
fimfuncao

funcao menor:inteiro
var aux,i,j:inteiro
inicio

aux <- num[1]

   para i de 1 ate 5 passo 1 faca
         se num[i] < aux entao
            aux <- num[i]
         fimse
      fimpara
   retorne aux
fimfuncao

Inicio

   para i de 1 ate 5 passo 1 faca
      escreval("Digite o", i,"º numero: ")
      leia(num[i])
   fimpara

   resultadomaior <- maior()

   resultadomenor <- menor()

Fimalgoritmo