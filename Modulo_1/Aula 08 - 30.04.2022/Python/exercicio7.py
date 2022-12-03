num1 = int(input("Digite o primeiro numero: "))

num2 = int(input("Digite o segundo numero: "))

soma = num1 + num2

if soma > 20:
    print(f"Seu numero é maior que 20, ele será somado a 8. Resultado: {soma + 8}")
else:
    print(f"Seu numero é menor que 20, ele será subtraido a 5. Resultado: {soma - 5}")