puts("Digite a letra: ")
letra = gets

print(letra.upcase)

if (letra.upcase == "A" or letra.upcase == "E" or letra.upcase == "I" or letra.upcase == "O" or letra.upcase == "U")
  print("Vogal")
else
  print("Consoante")
end