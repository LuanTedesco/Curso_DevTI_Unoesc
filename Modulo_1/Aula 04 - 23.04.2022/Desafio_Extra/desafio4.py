treino1_km = float(
    input("Digite a quantidade em KM percorridos no primeiro treino: "))
treino1_min = float(input("Digite o tempo em minutos do primeiro treino: "))

treino2_km = float(
    input("Digite a quantidade em KM percorridos no segundo treino: "))
treino2_min = float(input("Digite o tempo em minutos do segundo treino: "))

treino3_km = float(
    input("Digite a quantidade em KM percorridos no terceiro treino: "))
treino3_min = float(input("Digite o tempo em minutos do terceiro treino: "))

total_km = (treino1_km + treino2_km + treino3_km)

media_km = (treino1_km + treino2_km + treino3_km)/3

total_min = (treino1_min + treino2_min + treino3_min)

media_min = (treino1_min + treino2_min + treino3_min)/3

print(f"Você percorreu {total_km:.2f} KM")

print(f"Sua media foi de {media_km:.2f} KM")

print(f"Você levou {total_min:.2f} Minutos")

print(f"Sua media de tempo foi de {media_min:.2f} Minutos")
