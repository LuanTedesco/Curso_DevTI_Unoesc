puts ("Digite seu salário por hora: ")
salario_hora = gets.to_i

puts ("Digite quantas horas você trabalhou: ")
horas_trabalhadas = gets.to_i

salario = (salario_hora * horas_trabalhadas)

puts ("Seu salario é de R$ #{salario}")