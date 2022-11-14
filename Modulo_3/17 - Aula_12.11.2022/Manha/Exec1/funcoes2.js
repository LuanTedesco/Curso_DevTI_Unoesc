let numero = 13

let parOuImpar = numero => {
  if (numero % 2 == 0) {
    return console.log(`${numero} é par`)
  } else {
    return console.log(`${numero} é impar`)
  }
}
parOuImpar(numero)
