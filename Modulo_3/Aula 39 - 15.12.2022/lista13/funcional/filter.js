const numeros = [42, 666, 90, 10, 50];

// Código no estilo imperativo
const resultados = [];
for (numero of numeros) {
    if (numero >= 50) {
        resultados.push(numero);
    }
}
console.log(resultados);
console.log();

// Código no estilo declarativo
const resultado = numeros.filter(numero => numero >= 50);
console.log(resultado);