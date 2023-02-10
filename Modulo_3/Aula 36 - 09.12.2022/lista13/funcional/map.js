const numeros = [1, 2, 3, 4, 5];

const resultado = numeros.map( numero => numero * numero );

// console.log('numeros:', numeros);
// console.log('resultado:', resultado);

const soma10 = num => num + 10;
const dobra = num => num * 2;
const emReais = num => `R$ ${parseFloat(num).toFixed(2).replace('.', ',')}`;

const res = numeros.map(soma10)
                   .map(dobra)
                   .map(emReais);
console.log(res);