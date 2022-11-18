function parOuImpar1(numero) {
    let resultado = numero % 2;

    if (!resultado) {
        return 'par';
    } else {
        return 'ímpar';
    }
    console.log(resultado);
}

const parOuImpar2 = (numero) => {
    let resultado = numero % 2;

    if (!resultado) {
        return 'par';
    } else {
        return 'ímpar';
    }
    console.log(resultado);
}

const parOuImpar3 = (numero) => !(numero % 2) ? 'par' : 'ímpar';

console.log('4 é', parOuImpar1(4));
console.log('5 é', parOuImpar1(5));

console.log('');

console.log('4 é', parOuImpar2(4));
console.log('5 é', parOuImpar2(5));

console.log('');

console.log('4 é', parOuImpar3(4));
console.log('5 é', parOuImpar3(5));