puts ("Digite seu salário por hora: ")
salario_hora = gets.to_i

puts ("Digite quantas horas você trabalhou: ")
horas_trabalhadas = gets.to_i

salario = (salario_hora * horas_trabalhadas)

puts ("Seu salario é de R$ #{salario}")

ir = (salario * 11/100)

inss = (salario * 8/100)

sindicato = (salario * 5/100)

puts ("Salário bruto: #{salario}")
puts ("Quanto pagou ao INSS: #{inss}")
puts ("Quanto pagou de sindicato: #{sindicato}")
puts ("Salário liquido: #{salario - ir - inss - sindicato}")