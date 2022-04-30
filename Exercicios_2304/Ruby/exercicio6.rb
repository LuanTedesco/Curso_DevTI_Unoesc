#custo de fabrica
#distribuidor = +28%
#impostos = +45%
# ? = conmsumidor

puts ("Digite o custo de fábrica")
  custo_fabrica = gets.to_f

distribuidor = (custo_fabrica * 28/100)

impostos = (custo_fabrica * 45/100)

puts ("O custo final do consumidor é R$ #{custo_fabrica + distribuidor + impostos}")