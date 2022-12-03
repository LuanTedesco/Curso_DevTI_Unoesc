nome = str(input("Digite seu nome: "))

livro = str(input("Digite o nome do livro: "))

usuario = int(input("Digite 1 para entrar como Professor ou 2 para entrar como Aluno: "))

if usuario == 1:
    print(f"O Professor {nome} vai alugar o livro {livro}, o prazo para devolução é de 10 dias")
elif usuario == 2:
    print(f"O Aluno {nome} vai alugar o livro {livro}, o prazo para devolução é de 3 dias")
else:
    print(f"Tipo de usuario não encontrado, Digite 1 para Professor ou 2 para Aluno")