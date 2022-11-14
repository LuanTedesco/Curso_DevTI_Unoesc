class Pessoa {
    #nome;

    constructor(nome, sobrenome, idade, hobbies) {
        this.#nome = nome;
        this.sobrenome = sobrenome;
        this._idade = idade;
        this.hobbies = hobbies;
    }

    #nomeCompleto() {
        return this.#nome + ' ' + this.sobrenome;
    }

    info() {
        return this.#nomeCompleto() +
                ' tem ' + this.idade + ' anos';
    }

    listarHobbies() {
        this.hobbies.forEach(hobby => {
            console.log(`${this.#nome} gosta de ${hobby}`);
        });
    }

    get nome() { return this.#nome; }
    
    get idade() { return this._idade + 1; }
    set idade(idade) { this._idade = idade; }
}

const beltrano = new Pessoa('Beltrano', 
                            'da Silva',
                            20, 
                            ['cantar', 'dançar', 'ouvir música']);

beltrano.nome = 'Zé das Couves';
beltrano.salario = 123.45;

console.log(Pessoa);
console.log(beltrano);

console.log('\n' + beltrano.nome);

console.log(beltrano.idade);
beltrano.idade = 42;
console.log(beltrano.idade);
beltrano._idade = 45;
console.log(beltrano.idade);

console.log(beltrano.info());
beltrano.listarHobbies();