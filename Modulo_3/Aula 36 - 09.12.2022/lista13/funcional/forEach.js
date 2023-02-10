const animais = ['gato', 'cachorro', 'passarinho'];
const sons = ['mia', 'late', 'canta'];

animais.forEach( (animal, indice) => {
    console.log(animal, sons[indice]);
});

const funcao = (animal, indice) => { console.log(animal, sons[indice]); };

console.log();
animais.forEach(funcao);