lado1 = float(input("Digite o primeiro lado: "))

lado2 = float(input("Digite o segundo lado: "))

lado3 = float(input("Digite o terceiro lado: "))

angulo = (lado1 + lado2 + lado3)

if angulo > 90:
    print("Triângulo Obtusângulo")
elif angulo < 90:
    print("Triângulo Acutângulo")
else:
    print("Triângulo Retângulo")