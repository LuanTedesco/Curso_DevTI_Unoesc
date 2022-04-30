salario_hora = float(input("Digite o salário por hora: "))

horas_trabalhadas = float(input("Digite a quantidade de horas trabalhadas: "))

salario = float(salario_hora * horas_trabalhadas)

ir = float(salario * (11/100))

inss = float(salario * (8/100))

sindicato = float(salario * (5/100))

print(f"Salário bruto: {salario}")
print(f"Quanto pagou ao INSS: {inss}")
print(f"Quanto pagou de sindicato: {sindicato}")
print(f"Salário liquido: {salario - ir - inss - sindicato}")
