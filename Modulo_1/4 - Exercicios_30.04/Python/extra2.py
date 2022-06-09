preco = float(input("Digite o preço do DVD alugado: "))

categoria = str(input("Digite a categoria do DVD alugado (1 - Comum / 2 - Lançamento): "))

preco235 = preco - (preco * (40/100))

lancamento = preco + (preco * (15/100))

if categoria == ("1"):
  print(f"     Categoria: Comum     ")
  print(f" Dia da semana |Valor R$ ")
  print(f" Domingo       |R$ {preco:.2f}")
  print(f" Segunda-Feira |R$ {preco235:.2f}")
  print(f" Terça-Feira   |R$ {preco235:.2f}")
  print(f" Quarta-Feira  |R$ {preco:.2f}")
  print(f" Quinta-Feira  |R$ {preco235:.2f}")
  print(f" Sexta-Feira   |R$ {preco:.2f}")
  print(f" Sabado        |R$ {preco:.2f}")
elif categoria == ("2"):
  print(f"  Categoria: Lançamento  ")
  print(f" Dia da semana |Valor R$")
  print(f" Domingo       |R$ {lancamento:.2f}")
  print(f" Segunda-Feira |R$ {lancamento:.2f}")
  print(f" Terça-Feira   |R$ {lancamento:.2f}")
  print(f" Quarta-Feira  |R$ {lancamento:.2f}")
  print(f" Quinta-Feira  |R$ {lancamento:.2f}")
  print(f" Sexta-Feira   |R$ {lancamento:.2f}")
  print(f" Sabado        |R$ {lancamento:.2f}")
else:
  print("Categoria inválida (1 - Comum / 2 - Lançamento)")