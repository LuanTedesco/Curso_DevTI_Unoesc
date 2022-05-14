Algoritmo "exercicio4"

Var
   codigo, quantidade: inteiro
   preco: real

Inicio
   escreval("Digite o código do produto: ")
   leia(codigo)
   escreval("Digite a quantidade: ")
   leia(quantidade)


   escolha codigo
   caso 100
   preco <- 12.00 * quantidade
      escreval("Produto: Cachorro Quente")
      escreval("Quantidade: ", quantidade)
      escreval("Preço total: R$ ", preco)
   caso 101
   preco <- 17.00 * quantidade
      escreval("Produto: X-Salada")
      escreval("Quantidade: ", quantidade)
      escreval("Preço total: R$ ", preco)
   caso 102
   preco <- 20.00 * quantidade
      escreval("Produto: X-Bacon")
      escreval("Quantidade: ", quantidade)
      escreval("Preço total: R$ ", preco)
   caso 103
   preco <- 5.00 * quantidade
      escreval("Produto: Refrigerante")
      escreval("Quantidade: ", quantidade)
      escreval("Preço total: R$ ", preco)
   outrocaso
      escreval("Código de produto inválida")
   fimescolha





Fimalgoritmo