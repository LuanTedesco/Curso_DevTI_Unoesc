tipouser = str(input("Você é Aluno ou Professor? (1 - Professor / 2 - Aluno)"))

user_bd_aluno = str("Luan")
senha_bd_aluno = str("Luan123")

user_bd_professor = str("Habner")
senha_bd_professor = str("Habner123")

user_professor = ()
senha_professor = ()


if tipouser == "1":
    user_professor = str(input("Digite seu usuário: "))
    senha_professor = str(input("Digite sua senha: "))
elif user_professor == user_bd_professor:
    print("sim")
else:
    print("Não")


#else:
    
# user_aluno = str(input("Digite seu usuário: "))
# senha_aluno = str(input("Digite sua senha: "))
    





#if user == user_bd and senha == senha_bd:
#    print(f"Seja bem vindo {user}/n")
#    print(f"Qual livro você deseja alugar {user}/n")
#    print("1 = Dom Quixote, Miguel de Cervantes, 1605 /n 2 = Guerra e Paz, Liev Tolstói, 1869 /n A Montanha Mágica, Thomas Mann, 1924 /n Cem Anos de Solidão, Gabriel García Márquez, 1967")

#if  


#else:
#    print("Usuário ou senha inválidos")










#print("1 = Dom Quixote, Miguel de Cervantes, 1605 /n 2 = Guerra e Paz, Liev Tolstói, 1869 /n A Montanha Mágica, Thomas Mann, 1924 /n Cem Anos de Solidão, Gabriel García Márquez, 1967")






# livro = str(input("Digite o nome do livro: "))

#usuario = int(input("Digite 1 para entrar como Professor ou 2 para entrar como Aluno: "))

#if usuario == 1:
    #print(f"O Professor {nome} vai alugar o livro {livro}, o prazo para devolução é de 10 dias")
#elif usuario == 2:
    #print(f"O Aluno {nome} vai alugar o livro {livro}, o prazo para devolução é de 3 dias")
#else:
    #print(f"Tipo de usuario não encontrado, Digite 1 para Professor ou 2 para Aluno")