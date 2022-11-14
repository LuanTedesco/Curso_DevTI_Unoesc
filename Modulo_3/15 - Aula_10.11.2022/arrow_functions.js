// Função anônima
let quadrado1 = function(numero) {
    return numero * numero;
}

let quadrado2 = (numero) => {
    return numero * numero;
} 

let quadrado3 = numero => {
    return numero * numero;
}

// Return implícito
let quadrado4 = numero => numero * numero;

console.log(quadrado1(3));
console.log(quadrado2(3));
console.log(quadrado3(3));
console.log(quadrado4(3));