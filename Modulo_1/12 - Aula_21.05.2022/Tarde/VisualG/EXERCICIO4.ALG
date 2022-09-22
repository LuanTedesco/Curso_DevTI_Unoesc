Algoritmo "exercicio4"

Var
   val: vetor[1..3,1..3] de caracter
   l, c: inteiro
   v: caracter

Inicio

val[1,1] <- "-"
val[1,2] <- "-"
val[1,3] <- "-"
val[2,1] <- "-"
val[2,2] <- "-"
val[2,3] <- "-"
val[3,1] <- "-"
val[3,2] <- "-"
val[3,3] <- "-"

   para l de 1 ate 3 passo 1 faca
      para c de 1 ate 3 passo 1 faca
      escreval("")
         escreva("Você deseja inserir um X ou O? ")
         leia(v)
         escreva("Em qual linha deseja inserir? ")
         leia(l)
         escreva("Em qual coluna deseja inserir? ")
         leia(c)
         val[l,c] <- v
         limpatela
         para l de 1 ate 3 passo 1 faca
            escreval("")
            para c de 1 ate 3 passo 1 faca
               escreva(val[l,c])
            fimpara
         fimpara

      fimpara
   fimpara


Fimalgoritmo