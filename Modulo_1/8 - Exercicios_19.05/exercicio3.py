base = int(input("Entre com a base: "))
expoente = int(input("Entre com o expoente: "))
calculo = 1 
for i in range(0,expoente,1):
    calculo = calculo * base
print(base,"elevando a",expoente,"=",calculo)
