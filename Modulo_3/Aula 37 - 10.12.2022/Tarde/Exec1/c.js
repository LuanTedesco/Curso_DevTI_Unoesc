const alunos = [
  { nome: 'Fulana', nota: 7.3, bolsista: true },
  { nome: 'Beltrana', nota: 9.2, bolsista: true },
  { nome: 'Sicrana', nota: 9.8, bolsista: false },
  { nome: 'Maria das Dores', nota: 8.7, bolsista: true }
]

function retornaNota(value) {
  return value.nota
}
var mostraNota = alunos.map(retornaNota)

var somaNota = mostraNota.reduce((acumulador, atual) => {
  return (acumulador += atual)
})

console.log(mostraNota)
console.log(somaNota)

function retornaBolsa(value) {
  return value.bolsista.toString()
}

var mostraBolsa = alunos.map(retornaBolsa)

var verificaBolsa =
  mostraBolsa.reduce((acumulador, atual) => {
    if (acumulador == atual) {
      return 'true'
    } else {
      return 'false'
    }
  }, 'true') == 'true'

console.log(verificaBolsa)

var verificaBolsa =
  mostraBolsa.reduce((acumulador, atual) => {
    if (acumulador == atual) {
      return 'false'
    } else {
      return 'false'
    }
  }, 'false') == 'false'

console.log(verificaBolsa)
