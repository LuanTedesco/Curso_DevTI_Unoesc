const animais = ['gato', 'cachorro', 'passarinho'];
const sons = ['mia', 'late', 'canta'];

// for .. of (somente um array por vez)
for (animal of animais) {
    console.log(animal);
}
console.log();

// for() clássico
for (let i=0; i<animais.length; i++) {
    console.log(animais[i], sons[i]);
}
console.log();

// forEach() usando uma arrow function como função callback
animais.forEach( (animal, indice) => {
    console.log(animal, sons[indice]);
});
console.log();

// Exemplo equivalente mas declarando a função separadamente
const funcao = (animal, indice) => { console.log(animal, sons[indice]); };
animais.forEach(funcao);