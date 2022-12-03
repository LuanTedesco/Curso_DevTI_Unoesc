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
      escreval("Triângulo Retângulo")
   senao
      se angulo > 90 entao
         escreval("Triângulo Obtusângulo")
      senao
         escreval("Triângulo Acutângulo")
      fimse
   fimse


Fimalgoritmo