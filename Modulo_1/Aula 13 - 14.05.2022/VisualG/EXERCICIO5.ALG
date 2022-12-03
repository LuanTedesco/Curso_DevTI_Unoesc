Algoritmo "exercicio5"

Var
   genero: caracter


Inicio
   escreva("Digite o genero (M/F): ")
   leia(genero)
   genero <- maiusc(genero)

   escolha genero
   caso "M"
      escreval("Masculino")
   caso "F"
      escreval("Feminino")
   outrocaso
      escreval("Genero não listado")
   fimescolha

Fimalgoritmo