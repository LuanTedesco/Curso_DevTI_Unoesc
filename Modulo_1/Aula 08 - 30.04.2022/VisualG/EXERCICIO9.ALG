Algoritmo "exercicio9"

Var
   lado1, lado2, lado3, angulo: real

Inicio
   escreval("Digite o primeiro lado: ")
   leia (lado1)

   escreval("Digite o segundo lado: ")
   leia (lado2)

   escreval("Digite o terceiro lado: ")
   leia (lado3)

   angulo <- (lado1 + lado2 + lado3)

   se angulo = 90 entao
      escreval("Tri�ngulo Ret�ngulo")
   senao
      se angulo > 90 entao
         escreval("Tri�ngulo Obtus�ngulo")
      senao
         escreval("Tri�ngulo Acut�ngulo")
      fimse
   fimse


Fimalgoritmo