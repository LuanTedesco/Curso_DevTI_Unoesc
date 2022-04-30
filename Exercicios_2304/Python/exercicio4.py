ano_usuario = int(input ("Digite quantos anos você viveu "))
mes_usuario = int(input ("Digite quantos meses você viveu "))
dia_usuario = int(input ("Digite quantos dias você viveu "))

anos_em_dias = ano_usuario * 365
mes_em_dias = mes_usuario * 30

soma_dias = dia_usuario + anos_em_dias + mes_em_dias

print (f"Você viveu {soma_dias} dias")