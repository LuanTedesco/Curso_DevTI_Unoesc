var sa = {
  nome: 'Senhor dos Anéis',
  escritor: 'J. R. R. Tolkien',
  diretor: 'Peter Jackson',
  hobbits: ['Merry', 'Pippin', 'Frodo', 'Sam', 'Bilbo'],
  magos: ['Gandalf', 'Radagast', 'Saruman']
}

function listarHobbies(sa) {
  sa.hobbits.forEach(hobbits => console.log(hobbits))
}

console.log()

function listarMagos(sa) {
  for (var value of sa.magos) {
    console.log(`o filme ${sa.nome} tem o mago chamado ${value}`)
  }
}

var ned
function criarResumo(sa) {
  return (ned = `Nome: ${sa.nome} | Escritor: ${sa.escritor} | Diretor: ${
    sa.diretor
  } | Hobbits: ${sa.hobbits.join()} | Magos: ${sa.magos.join()}`)
}
