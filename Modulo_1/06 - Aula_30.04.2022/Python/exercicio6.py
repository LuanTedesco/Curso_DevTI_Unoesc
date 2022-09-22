nome = str(input("Digite o seu nome"))

nota1 = float(input("Digite a primeiro nota: "))

nota2 = float(input("Digite a segunda nota: "))

nota3 = float(input("Digite a terceira nota: "))

media = (nota1 + nota2 + nota3)/3

if media >= 7:
    print(f"{nome} sua media é {media}, você está APROVADO!!")
elif media < 7 and media >= 5:
    print(f"{nome} sua media é {media}, você está em EXAME.")
else:
    print(f"{nome} sua media é {media}, você está REPROVADO :(")