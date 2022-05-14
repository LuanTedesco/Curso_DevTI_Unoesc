Algoritmo "exercicio8"

Var
   num1, num2, num3, num4, somaac, somabd: inteiro

Inicio
   escreval("Digite o primeiro numero: ")
   leia (num1)

   escreval("Digite o segundo numero: ")
   leia (num2)

   escreval("Digite o terceiro numero: ")
   leia (num3)

   escreval("Digite o quarto numero: ")
   leia (num4)

   somaac <- (num1 + num3)

   somabd <- (num2 * num4)

   se somaac > somabd entao
      escreval("A+C é maior que B*D")
   senao
      se somaac < somabd entao
         escreval("A+C é menor que B*D")
      senao
         escreval("A+C é igual a B*D")
      fimse
   fimse


Fimalgoritmo