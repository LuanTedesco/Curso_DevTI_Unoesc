Algoritmo "exercicio1"

Var
   raio, raio1, v: real
   i: inteiro

procedimento volume
inicio
para i de 1 ate 2 faca
raio1 <- raio1 * raio
fimpara
   v <- (4/3*Pi*raio1)
fimprocedimento

Inicio

   escreval("Digite o Raio: ")
   leia(raio)
   raio1 <- raio
   volume
   escreval(v)

Fimalgoritmo