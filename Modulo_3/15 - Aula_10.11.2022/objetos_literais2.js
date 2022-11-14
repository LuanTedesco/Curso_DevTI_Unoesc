const nome = 'Fulano';
const sobrenome = 'da Silva';
const endereco = 'Rua x, 42';
const idade = 42;
const hobbies = ['cantar', 'dançar', 'ouvir música'];

const fulano = {
    nome, sobrenome, endereco, idade, hobbies,
    nomeCompleto() {
        return this.nome + ' ' + this.sobrenome;
    },
};

console.table(fulano);
console.log(fulano.nome);
console.log(fulano.nomeCompleto());