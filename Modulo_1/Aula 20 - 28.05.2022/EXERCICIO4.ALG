Algoritmo "exercicio4"

Var
   altura: real
   sexo: caracter
   resultado: real

funcao pesoidealF(x:real):real
var aux:real
inicio
   aux <- (62.1 * x) - 44.7
   retorne aux
fimfuncao

funcao pesoidealM(x:real):real
var aux:real
inicio
   aux <- (72.7 * x) - 58
   retorne aux
fimfuncao

Inicio

   escreval("Digite a sua altura: ")
   leia(altura)
   escreval("Digite o seu sexo (M/F): ")
   leia(sexo)

   se sexo = "F" entao
      resultado <- pesoidealF(altura)
   senao
      se sexo = "M" entao
         resultado <- pesoidealM(altura)
      fimse
   fimse
   limpatela
   escreval("O seu peso ideal é",resultado," KG")



Fimalgoritmo