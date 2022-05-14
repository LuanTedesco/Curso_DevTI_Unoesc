Algoritmo "exercicio9"

Var
   valor, total: real
   pais: caracter

Inicio
   escreva("Digite o valor do produto: ")
   leia(valor)
   escreval("Estados Unidos: R$ 60,00")
   escreval("França: R$ 75,50")
   escreval("Mexico: R$ 50,00")
   escreval("Argentina: 27,35")
   escreval("China: 80,00")
   escreva("Digite o país de destino: ")
   leia(pais)
   pais <- maiusc(pais)

   escolha pais
   caso "Estados Unidos"
      total <- valor + 60.00
      escreval("O total a ser pago é: R$", total)
   caso "França"
      total <- valor + 75.50
      escreval("O total a ser pago é: R$", total)
   caso "Mexico"
      total <- valor + 50.00
      escreval("O total a ser pago é: R$", total)
   caso "Argentina"
      total <- valor + 27.35
      escreval("O total a ser pago é: R$", total)
   caso "China"
      total <- valor + 80.00
      escreval("O total a ser pago é: R$", total)
   outrocaso
      escreval("País inválido")
   fimescolha

Fimalgoritmo