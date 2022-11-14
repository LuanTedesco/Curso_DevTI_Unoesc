const beltrano = {
    nome: 'Beltrano',
    sobrenome: 'da Silva',
    endereco: 'Rua x, 666',
    _idade: 666,
    hobbies: ['cantar', 'dançar', 'ouvir música'],
    nomeCompleto: function() {
        return this.nome + ' ' + this.sobrenome;
    },
    info() {
        return this.nomeCompleto() +
                ' | ' + this.endereco;
    },
    listarHobbies() {
        this.hobbies.forEach(hobby => {
            console.log(this.nome + ' gosta de ' + hobby);
        })
    },
    get idade() { return this._idade++; },
    set idade(idade) { this._idade = idade; }
};

console.log(beltrano.nome);
console.log(beltrano.nomeCompleto());
console.log(beltrano.info());
beltrano.listarHobbies();