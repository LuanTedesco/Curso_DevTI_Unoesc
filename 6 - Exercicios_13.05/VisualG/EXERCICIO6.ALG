Algoritmo "exercicio6"

Var
   num1, num2: real
   operacao: caracter

Inicio
   escreval("Digite o primeiro numero: ")
   leia(num1)
   escreval("Digite o segundo numero: ")
   leia(num2)
   escreval("Digite a operação a ser realizada (+,-,*,/): ")
   leia(operacao)


   escolha operacao
   caso "+"
   escreval("O resultado a operação de soma é: ", num1 + num2)
   caso "-"
   escreval("O resultado a operação de subtração é: ", num1 - num2)
   caso "*"
   escreval("O resultado a operação de multiplicação é: ", num1 * num2)
   caso "/"
   escreval("O resultado a operação de divisão é: ", num1 / num2)
   outrocaso
      escreval("Operação inválida")
   fimescolha





Fimalgoritmo