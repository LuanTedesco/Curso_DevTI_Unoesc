Algoritmo "exercicio6"

Var
   num1, num2: real
   operacao: caracter

Inicio
   escreval("Digite o primeiro numero: ")
   leia(num1)
   escreval("Digite o segundo numero: ")
   leia(num2)
   escreval("Digite a opera��o a ser realizada (+,-,*,/): ")
   leia(operacao)


   escolha operacao
   caso "+"
   escreval("O resultado a opera��o de soma �: ", num1 + num2)
   caso "-"
   escreval("O resultado a opera��o de subtra��o �: ", num1 - num2)
   caso "*"
   escreval("O resultado a opera��o de multiplica��o �: ", num1 * num2)
   caso "/"
   escreval("O resultado a opera��o de divis�o �: ", num1 / num2)
   outrocaso
      escreval("Opera��o inv�lida")
   fimescolha





Fimalgoritmo