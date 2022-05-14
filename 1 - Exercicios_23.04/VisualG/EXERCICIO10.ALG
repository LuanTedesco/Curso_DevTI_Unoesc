Algoritmo "exercicio2"

Var
salario_hora, valor_hora, salario, ir, inss, sindicato: real


Inicio
escreval ("Digite o sarário por hora: ")
leia(salario_hora)

escreval ("Digite o numero de horas trabalhadas: ")
leia(valor_hora)

salario <- salario_hora * valor_hora

ir <- salario * (11/100)

inss <- salario * (8/100)

sindicato <- salario * (5/100)

salario <- salario - ir
salario <- salario - inss
salario <- salario - sindicato



escreval ("O seu salário é de: R$",salario)




Fimalgoritmo