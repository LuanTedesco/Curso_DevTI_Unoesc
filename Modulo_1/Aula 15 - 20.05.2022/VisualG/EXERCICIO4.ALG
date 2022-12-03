Algoritmo "exercicio4"

Var
   nota: vetor[1..3,1..4] de real
   linha, coluna: inteiro
   soma, media: real

Inicio
   para linha de 1 ate 3 faca
      escreval("")
      soma<-0
      para coluna de 1 ate 4 faca
         escreva("Aluno:",linha," Nota:",coluna," | ")
         leia(nota[linha,coluna])
         soma<-soma+nota[linha,coluna]
      fimpara
      media<-soma/4
      escreval("Média do aluno",linha,":",media)
   fimpara

Fimalgoritmo
