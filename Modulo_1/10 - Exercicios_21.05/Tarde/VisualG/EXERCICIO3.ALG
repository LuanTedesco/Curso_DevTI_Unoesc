Algoritmo "exercicio3"

Var
   val: vetor[1..3,1..3] de inteiro
   mode: vetor[1..3,1..3] de inteiro
   l, c, par, impar: inteiro

Inicio

   //  par 0
   //  impar 1

   l <- 1
   c <- 1
   par <- 0
   impar <- 0

   para l de 1 ate 3 passo 1 faca
      limpatela
      para c de 1 ate 3 passo 1 faca
         escreva("Digite o numero da", c,"ª coluna e ", l, "ª linha: ")
         leia(val[l,c])
         mode[l,c] <- val[l,c] mod 2
      fimpara
   fimpara
   
   limpatela
   
   para l de 1 ate 3 passo 1 faca
      escreval("")
      para c de 1 ate 3 passo 1 faca
         escreva(val[l,c])
      fimpara
   fimpara
   
   escreval("")
   escreval("")

   para l de 1 ate 3 passo 1 faca
      para c de 1 ate 3 passo 1 faca
         se mode[l,c] = 1 entao
            impar <- impar + 1
         senao
            par <- par + 1
         fimse
      fimpara
   fimpara

   para l de 1 ate 3 passo 1 faca
      escreval("")
      para c de 1 ate 3 passo 1 faca
         escreva(val[l,c])
      fimpara
   fimpara
   
   escreval("")
   escreval("")
   
   escreval("A quantidade de numeros pares é: ", par)
   escreval("A quantidade de numeros impar é: ", impar)
Fimalgoritmo