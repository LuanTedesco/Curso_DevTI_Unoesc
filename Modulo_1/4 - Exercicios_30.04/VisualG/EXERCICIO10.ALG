Algoritmo "exercicio10"

Var
   num1, num2, num3: inteiro

Inicio
   escreval("Digite o primeiro numero: ")
   leia (num1)

   escreval("Digite o segundo numero: ")
   leia (num2)

   escreval("Digite o terceiro numero: ")
   leia (num3)

   se (num1 > num2) e (num1 > num3) entao
      escreval("O numero", num1, " é maior numero")
   senao
      se (num2 > num1) e (num2 > num3) entao
      escreval("O numero", num2, " é maior numero")
      senao
         escreval("O numero", num3, " é maior numero")
      fimse
   fimse


Fimalgoritmo