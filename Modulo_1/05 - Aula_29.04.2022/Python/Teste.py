from time import sleep
usuario = str(input("Digite um nome de usuário: "))
senha = str(input("Informe uma senha: "))
print("Processando...")
sleep(2)
print(f"Olá {usuario} seu cadastro foi criado com sucesso!")
print("Informe seu login e senha abaixo")
acesso = str(input("Informe seu nome de usuário: "))
senhaacesso = str(input("Informe sua senha: "))
if acesso == usuario and senhaacesso == senha:
    print(f"Seja bem vindo {usuario}")
else:
    print("Usuário não encontrado")
