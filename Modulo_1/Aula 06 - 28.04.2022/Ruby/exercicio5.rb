puts("1 - Dormir")
puts("2 - Estudar algoritmos")
puts("3 - Passear")
puts("4 - Outros")
puts("O que você gosta de fazer no final de semana? ")
codigo = gets.to_i

if codigo = 1
  puts("Dormir")
elsif codigo = 2
  puts("Estudar algoritmos")
elsif codigo = 3
  puts("Passear")
elsif codigo = 4
  puts("Outros")
else
  print("Código inválido")
end