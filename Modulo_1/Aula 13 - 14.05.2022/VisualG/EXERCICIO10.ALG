Algoritmo "exercicio10"

Var
   compra, total: real
   codigo: inteiro

Inicio
   escreva("Digite o valor da compra: ")
   leia(compra)
   escreval("1 - Cliente")
   escreval("2 - Funcionário")
   escreval("3 - Vip")
   escreva("Digite o Código: ")
   leia(codigo)

   escolha codigo
   caso 1
      total <- compra
      escreval("O total a ser pago é: R$", total)
   caso 2
      total <- compra * 0.10
      total <- compra - total
      escreval("O total a ser pago é: R$", total)
   caso 3
      total <- compra * 0.05
      total <- compra - total
      escreval("O total a ser pago é: R$", total)
   outrocaso
      escreval("Código inválido")
   fimescolha

Fimalgoritmo