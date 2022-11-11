// Função com nome
function quadrado(numero) {
  return numero * numero
}
console.log('Função convencional:', quadrado(5))

// Função anônima
let quadrado1 = function (numero) {
  return numero * numero
}
console.log('Função anônima:', quadrado1(5))

// Arrow function
let quadrado2 = numero => {
  return numero * numero
}
console.log('Arrow function:', quadrado2(5))

// Arrow function mais simples
let quadrado3 = numero => {
  return numero * numero
}
console.log('Arrow function mais simples:', quadrado3(5))

// Arrow function com retorno (return) implícito
let quadrado4 = numero => numero * numero
console.log('Arrow function com return implícito:', quadrado4(5))
