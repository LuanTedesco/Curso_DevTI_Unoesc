Algoritmo "exercicio3"

Var
   nomes: vetor[1..5] de caracter
   i: inteiro
   nome: caracter
   nomecerto: caracter
   busca: logico

Inicio

   nomes[1] <- "Maria"
   nomes[2] <- "Luan"
   nomes[3] <- "Habner"
   nomes[4] <- "Thiago"
   nomes[5] <- "Luana"

   escreva("Digite o nome: ")
   leia(nome)

   para i de 1 ate 5 passo 1 faca
      se nome = nomes[i] entao
         busca <- verdadeiro
      fimse
   fimpara

   se busca = verdadeiro entao
      escreval("Achei")
   senao
      escreval("Não achei")
   fimse

   // para i de 1 ate 5 passo 1 faca
   //    se nomecerto <> nomes[i] entao
   //       escreval("Não achei")
   //    fimse
   //  fimpara



Fimalgoritmo