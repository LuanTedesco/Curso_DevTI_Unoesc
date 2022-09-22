nome = str(input("Digite o seu nome: "))

idade = int(input("Digite a sua idade: "))

if idade < 16:
    print(f"{nome}, você não pode votar!")
else:
    print(f" {nome} você está apto para votar!")
