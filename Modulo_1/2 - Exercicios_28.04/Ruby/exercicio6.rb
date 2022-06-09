puts("Digite o numero: ")
numero = gets.to_i

if numero < 0
  puts("Numero nagativo")
elsif numero > 0
  puts("Numero positivo")
else
  puts("Igual a 0")
end