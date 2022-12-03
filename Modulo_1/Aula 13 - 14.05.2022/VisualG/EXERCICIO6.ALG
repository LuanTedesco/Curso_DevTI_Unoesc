Algoritmo "exercicio6"

Var
   mes: caracter


Inicio
   escreva("Digite o mês: ")
   leia(mes)
   mes <- maiusc(mes)

   escolha mes
   caso "Dezembro", "Janeiro", "Fevereiro", "Junho", "Julho"
      escreval("Este é um mês de alta temporada")
   caso "Março", "Abril", "Maio", "Agosto", "Setembro", "Outubro", "Novembro"
      escreval("Este é um mês de baixa temporada")
   outrocaso
      escreval("Erro, Mês incorreto")
   fimescolha

Fimalgoritmo