Algoritmo "Prova 04/06"


Var
   opcao: caracter
   num: vetor[1..10] de inteiro
   cad_num, cadastro, resposta, i, j, posicao, posicao2: inteiro
   resposta2: logico


funcao cadastro(x:inteiro): logico
var aux: logico j: inteiro
inicio
   aux <- falso
   se posicao <= 10 entao
      num[posicao] <- x
      aux <- verdadeiro
   fimse
   retorne aux
fimfuncao

funcao busca(x:inteiro): logico
var aux: logico j: inteiro
inicio

   para j de 1 ate 10 passo 1 faca
      se num[j] = x entao
         posicao2 <- j
         aux <- verdadeiro
      fimse
   fimpara
   retorne aux

fimfuncao

funcao excluir(x:inteiro):logico
var aux: logico j,i: inteiro
   numx: vetor[1..11] de inteiro
inicio

   para j de 1 ate 10 passo 1 faca
      numx[j] <- num[j]
   fimpara

   para j de 1 ate 10 passo 1 faca
      se x = num[j] entao
         num[j] <- 0
         aux <- verdadeiro
         posicao <- posicao - 1
         para i de j ate 10 passo 1 faca
            num[i] <- numx[i+1]
         fimpara
      fimse
   fimpara

   retorne aux
fimfuncao

procedimento listar
inicio
   escreval("Os numeros cadastrados são: ")
   escreval("")
   para j de 1 ate 10 passo 1 faca
      se num[j] <> 0 entao
         escreval(num[j])
      fimse
   fimpara
   escreval("")
fimprocedimento

procedimento soma
inicio
   para i de 1 ate 10 passo 1 faca
      resposta <- resposta + num[i]
   fimpara
   escreval("")
fimprocedimento


Inicio

   posicao <- 0

   repita
      escreval("- MENU ------------------------------------")
      escreval("A - Cadastrar um novo número               |")
      escreval("B - Buscar um número                       |")
      escreval("C - Excluir um número                      |")
      escreval("D - Listar os números cadastrados          |")
      escreval("E - Exibir a soma dos números do vetor     |")
      escreval("F - Sair do sistema                        |")
      escreval("-------------------------------------------")
      leia(opcao)
      opcao <- (maiusc(opcao))

      se opcao = "A" entao
         posicao <- posicao + 1
         limpatela
         escreval("Digite o numero a ser cadastrado: ")
         leia(cad_num)
         resposta2 <- cadastro(cad_num)
         limpatela
         se resposta2 entao
            escreval("O numero", cad_num, " foi cadastrado com sucesso!!")
            escreval("")
         senao
            escreval("O limite de numeros foi exedido!!")
            escreval("")
         fimse
      senao
         se opcao = "B" entao
            limpatela
            escreval("Digite o numero para busca: ")
            leia(cad_num)
            resposta2 <- busca(cad_num)
            se resposta2 = verdadeiro entao
               limpatela
               escreval("O numero", cad_num, " foi encontrado, ele está na posição",posicao2)
               escreval("")
            senao
               limpatela
               escreval("O numero", cad_num, " não foi encontrado!!")
               escreval("")
            fimse
         senao
            se opcao = "C" entao
               limpatela
               escreval("Digite o numero a ser excluido: ")
               leia(cad_num)
               resposta2 <- excluir(cad_num)
               se resposta2 entao
                  limpatela
                  escreval("O numero", cad_num, " foi exluido!!")
                  escreval("")
               senao
                  limpatela
                  escreval("O numero", cad_num, " não foi encontrado, nenhum dado foi excluido!!")
                  escreval("")
               fimse
            senao
               se opcao = "D" entao
                  limpatela
                  listar
               senao
                  se opcao = "E" entao
                     limpatela
                     soma
                     escreval("A soma de todos os numero do vetor é: ",resposta)
                     escreval("")
                  senao
                     se opcao = "F" entao
                        limpatela
                        escreval("Saindo do sistema")
                        interrompa
                     senao
                        limpatela
                        escreval("Opção não encontrada")
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   ate opcao = "F"

Fimalgoritmo