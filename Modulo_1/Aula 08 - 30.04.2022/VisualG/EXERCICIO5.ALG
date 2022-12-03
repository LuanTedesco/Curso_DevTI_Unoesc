Algoritmo "exercicio5"

Var
   livro, nome: caracter
   tipousuario: inteiro

Inicio

escreval("Digite seu nome: ")
   leia (nome)

   escreval("Digite o nome do livro: ")
   leia (livro)

   escreval("Digite 1 para entrar como Professor ou 2 para entrar como Aluno")
   leia (tipousuario)

   se tipousuario = 1 entao
      escreval("O Professor ", nome, " vai alugar o livro ", livro, ", o prazo para a devolução é de 10 dias")
   senao
      se tipousuario = 2 entao
         escreval("O Aluno ", nome, " vai alugar o livro ", livro, ", o prazo para a devolução é de 3 dias")
      senao
         escreval("Tipo de usuario não encontrado, Digite 1 para Professor ou 2 para Aluno")
      fimse
   fimse

Fimalgoritmo