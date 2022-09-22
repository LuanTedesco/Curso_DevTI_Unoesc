Algoritmo "exercicio7"

Var
   num1, num2, num3, num4, soma, multip: inteiro

Inicio
   escreval("Digite o primeiro numero: ")
   leia (num1)

   escreval("Digite o segundo numero: ")
   leia (num2)

   escreval("Digite o terceiro numero: ")
   leia (num3)

   escreval("Digite o quarto numero: ")
   leia (num4)

   soma <- (num1 + num3)

   multip <- (num2 * num4)

   se soma > multip entao
      escreval(soma, " é maior que", multip)
   senao
      se soma < multip entao
         escreval(soma, " é menor que", multip)
      senao
         escreval(soma, " é igual a", multip)
      fimse
   fimse


Fimalgoritmo