Algoritmo "Preço de custo"

Var

custo, valor, percentual: real


Inicio

escreva("Digite o custo do produto: ")
leia(custo)
escreva("Digite o percentual para venda: ")
leia(percentual)
percentual <- (percentual/100) * custo
valor <- custo + percentual
escreval("O valor de venda é: ",valor)

Fimalgoritmo