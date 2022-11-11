function somar(a, b) {
  return a + b
}

console.log(somar(40, 2))
console.log(somar(42))
console.log(undefined, 50)

function audacao(pessoa = 'Fulano', saudacao = 'Olá') {
  console.log(saudacao, pessoa)
}

saudacao()
