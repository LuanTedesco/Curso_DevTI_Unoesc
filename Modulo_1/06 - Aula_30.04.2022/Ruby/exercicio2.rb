puts("Digite o seu nome: ")
nome = gets.to_s

puts("Digite a idade: ")
idade = gets.to_i

if idade < 16
  puts("Você não pode votar #{nome}")
else
  puts("Você pode votar #{nome}")
end