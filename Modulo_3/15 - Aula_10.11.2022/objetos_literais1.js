// Variáveis globais
const nome = 'Fulano';
const sobrenome = 'da Silva';
const endereco = 'Rua x, 42';
const idade = 42;
const hobbies = ['cantar', 'dançar', 'ouvir música'];

const fulano = {
    // Atribui as variáveis globais (lado direito) aos atributos (antes dos dois pontos : )
    nome: nome,
    sobrenome: sobrenome,
    endereco: endereco,
    idade: idade,
    hobbies: hobbies,
    nomeCompleto: function() {
        return this.nome + ' ' + this.sobrenome;
    },
};

console.log(fulano);
console.log(typeof fulano);

console.log('');

console.log(fulano.nome);
console.log(fulano.nomeCompleto());