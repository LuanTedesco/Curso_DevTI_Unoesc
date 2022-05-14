Algoritmo "exercicio3"

Var
   num1, num2, num3, total: real
   codigo: inteiro


Inicio
   escreva("Digite o primeiro numero: ")
   leia(num1)
   escreva("Digite o segundo numero: ")
   leia(num2)
   limpatela
   escreval("1 - Média")
   escreval("2 - Diferença")
   escreval("3 - Produto")
   escreval("4 - Divisão")
   escreva("Digite o código da Operação: ")
   leia(codigo)

   escolha codigo
   caso 1
   total <- (num1 + num2)/2
      escreval("A média entre os dois numeros é: ", total)
   caso 2
   total <- num1 - num2
      escreval("A diferença entre os dois numeros é: ", total)
   caso 3
   total <- num1 * num2
      escreval("O produto entre os dois numeros digitados é: ", total)
   caso 4
   total <- num1 / num2
      escreval("A divisão entre os dois numeros é: ", total)
   outrocaso
      escreval("Código inválido")
   fimescolha


Fimalgoritmo