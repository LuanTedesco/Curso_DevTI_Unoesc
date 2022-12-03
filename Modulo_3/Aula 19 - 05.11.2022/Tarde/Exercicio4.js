let notas = [2, 4, 5, 4, 3]

function somar() {
  let soma = 0
  for (let i in notas) {
    soma += notas[i]
  }
  return soma
}
console.log(soma)
