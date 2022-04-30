num1 = int(input("Digite o primeiro numero: "))

num2 = int(input("Digite o segundo numero: "))

num3 = int(input("Digite o terceiro numero: "))

if num1 > num2 and num1 > num3:
    print(f"{num1} é o maior numero")
elif num2 > num1 and num2 > num3:
    print(f"{num2} é o maior numero")
else:
    print(f"{num3} é o maior numero")