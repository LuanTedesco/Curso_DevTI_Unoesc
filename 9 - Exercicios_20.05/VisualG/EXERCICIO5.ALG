Algoritmo "Atividade 5"

Var
   numero: vetor[1..10,1..10] de inteiro
   opcao, valor, linha, coluna: inteiro

Inicio
   escreval("1 - Inserir valor na matriz")
   escreval("2 - Visualizar matriz")
   escreval("3 - sair")
   escreva("Escolha uma das opções:")
   leia(opcao)

   enquanto opcao <> 3 faca
      escolha opcao
      caso 1
         escreval("Em qual linha deseja inserir")
         leia(linha)
         escreval("Em qual coluna deseja inserir")
         leia(coluna)
         escreval("Qual valor deseja armazenar")
         leia(valor)
         numero[linha,coluna] <- valor
      caso 2
         para linha de 1 ate 10 faca
            escreval("")
            para coluna de 1 ate 10 faca
               escreva(numero[linha,coluna])
            fimpara
         fimpara
      caso 3
         escreval("Encerrando sistema..."
      outrocaso
         escreval("Opção inválida!")
      fimescolha

      escreval("")
      escreval("------------------------")
      escreval("1 - Inserir valor na matriz")
      escreval("2 - Visualizar matriz")
      escreval("3 - sair")
      escreval("------------------------")
      escreva("Escolha uma das opções:")
      leia(opcao)

   fimenquanto



Fimalgoritmo