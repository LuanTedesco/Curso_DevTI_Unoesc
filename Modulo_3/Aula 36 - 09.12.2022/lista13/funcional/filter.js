const numeros = [42, 666, 90, 10, 50];

console.log(numeros.filter(numero => numero >= 50));

// Código equivalente
for (numero of numeros) {
    if (numero >= 50) {
        console.log(numero);
    }
}