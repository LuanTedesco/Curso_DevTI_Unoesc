num1 = int(input("Digite o primeiro numero: "))

num2 = int(input("Digite o segundo numero: "))

num3 = int(input("Digite o terceiro numero: "))

num4 = int(input("Digite o quarto numero: "))

soma = num1 + num3

multip = num2 * num4

if soma > multip:
    print(f"{soma} é maior que {multip}")
elif soma < multip:
    print(f"{soma} é menor que {multip}")
else:
    print(f"{soma} é igual a {multip}")