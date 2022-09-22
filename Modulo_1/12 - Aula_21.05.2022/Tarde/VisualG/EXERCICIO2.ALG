Algoritmo "exercicio2"

Var
   val: vetor[1..2,1..2] de inteiro
   mode: vetor[1..2,1..2] de inteiro
   l, c: inteiro

Inicio

   //  par 0
   //  impar 1

   l <- 1
   c <- 1

   para l de 1 ate 2 passo 1 faca
      limpatela
      para c de 1 ate 2 passo 1 faca
         escreva("Digite o numero da", c,"ª coluna e ", l, "ª linha")
         leia(val[l,c])
         mode[l,c] <- val[l,c] mod 2
      fimpara
   fimpara

   escreval("")
   escreval("Matriz Inserida:")
   
   para l de 1 ate 2 passo 1 faca
      escreval("")
      para c de 1 ate 2 passo 1 faca
         escreva(val[l,c])
      fimpara
   fimpara

   para l de 1 ate 2 passo 1 faca
      para c de 1 ate 2 passo 1 faca
         se mode[l,c] = 1 entao
            val[l,c] <- val[l,c] + 1
         senao
            val[l,c] <- val[l,c] - 1
         fimse
      fimpara
   fimpara

   escreval("")
   escreval("Matriz Resultado:")
   
   para l de 1 ate 2 passo 1 faca
      escreval("")
      para c de 1 ate 2 passo 1 faca
         escreva(val[l,c])
      fimpara
   fimpara

Fimalgoritmo