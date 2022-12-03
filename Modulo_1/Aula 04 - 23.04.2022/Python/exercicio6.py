custo_fabrica = int(input("Digite o custo de fábrica "))

distribuidora = float(custo_fabrica * (28/100))

impostos = float(custo_fabrica * (45/100))

custo_final = float(custo_fabrica + impostos + distribuidora)

print(f"O custo final para o consumidor é de R$ {custo_final:.2f}")
