let numero = 10

let parOuImpar = numero =>
  numero % 2 == 0
    ? console.log(`${numero} é par`)
    : console.log(`${numero} é impar`)

parOuImpar(numero)
