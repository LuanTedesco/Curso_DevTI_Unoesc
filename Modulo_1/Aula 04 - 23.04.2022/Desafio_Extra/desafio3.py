nome_vendedor = (input("Digite o nome do vendedor: "))
salario_vendedor = float(input("Digite o salario do vendedor: "))
total_de_vendas = float(input("Digite o total de vendas do vendedor: "))

calculo = (total_de_vendas*(15/100))
salario = (calculo + salario_vendedor)

print(f"O salário do vendedor {nome_vendedor} é R$ {salario:.2f}")
