compra = float(input("Digite o numero de maçãs compradas: "))

if compra > 12:
    print(f"O valor da compra é de R$ {compra * 0.30}")
else:
    print(f"O valor da compra é de R$ {compra * 0.25}")
