const numeros = [5, 3, 2, 7];

// Estilo imperativo
let total = 0;
for (numero of numeros) {
    console.log(total, numero);
    total += numero;
}
console.log(total);
console.log();

// Estilo funcional/declarativo
const soma = numeros.reduce( (acumulador, atual) => {
    console.log(acumulador, atual);
    return acumulador + atual;
}, 0);

console.log(soma);