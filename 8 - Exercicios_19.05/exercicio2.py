#quantidade de alunos
#nota de cada uma
#media da turma

contador = 0
nota = 0

alunos = float(input("Digite a quantidade de alunos da turma: "))

while contador < alunos:
  nota1 = float(input(("Digite a nota do aluno: ")))
  contador = contador + 1
  nota = nota + nota1
media = nota / alunos
print(f"A media da turma é: {media}")
