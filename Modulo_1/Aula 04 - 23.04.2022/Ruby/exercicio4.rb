puts ("Digite quantos anos você viveu")
anos = gets.to_i

puts ("Digite quantos meses você viveu")
meses = gets.to_i

puts ("Digite quantos dias você viveu")
dias = gets.to_i

anos_to_dias = (anos * 365)

meses_to_dias = (meses * 30)

puts ("Você já viveu #{anos_to_dias + meses_to_dias + dias} dias")