const numeros = [1, 2, 3, 4, 5];

const resultados = [];
for (numero of numeros) {
    resultados.push(numero * numero);
}

console.log('numeros:', numeros);
console.log('resultado:', resultados);
console.log();

// Estilo funcional/declarativo
const resultado = numeros.map( numero => numero * numero );

console.log('numeros:', numeros);
console.log('resultado:', resultado);
console.log();

// Mapeamentos encadeados
const soma10 = num => num + 10;
const dobra = num => num * 2;
const emReais = num => `R$ ${parseFloat(num).toFixed(2).replace('.', ',')}`;

const res = numeros.map(soma10)
                   .map(dobra)
                   .map(emReais);
console.log(res);