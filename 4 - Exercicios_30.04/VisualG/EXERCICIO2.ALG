Algoritmo "exercicio2"

Var
   nome: caracter
   idade: inteiro

Inicio

   escreval("Digite o seu nome: ")
   leia (nome)
   escreval("Digite a sua idade: ")
   leia (idade)

   se idade < 16 entao
      escreval(nome, " você não pode votar!")
   senao
      escreval(nome, " você está apto para votar!")
   fimse

Fimalgoritmo