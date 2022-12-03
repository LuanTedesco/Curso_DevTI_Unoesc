const fulano = new Object();
// const fulano = {};

console.log(typeof Object);
console.log(typeof new Object);
console.log(typeof fulano);
console.log('');

fulano.nome = 'Fulano';
fulano.sobrenome = 'da Silva';
fulano.endereco = 'Rua x, 42';
fulano.idade = 42;
fulano.hobbies = ['cantar', 'dançar', 'ouvir música'];

fulano.listarHobbies = function() {
    // Usando for ... of
    for(const hobbie of this.hobbies) {
        process.stdout.write(hobbie + ' ');
    }
    console.log('\n---');

    // Usando forEach (com _this e com bind())
    // let _this = this;
    this.hobbies.forEach(function(hobby) {
        console.log(this.nome + ' gosta de ' + hobby);
    }.bind(this));
    console.log('---');

    // Usando arrow function
    this.hobbies.forEach(hobby => {
        console.log(this.nome + ' gosta de ' + hobby);
    });
}

fulano.nomeCompleto = function() {
    return this.nome + ' ' + this.sobrenome;
} 

fulano.info = function() {
    return this.nomeCompleto() + ' | ' + this.endereco;
}

console.log(fulano);
console.table(fulano);
console.log('-----');
console.log(fulano.nome);
console.log(fulano.nomeCompleto());
console.log(fulano.info());
fulano.listarHobbies();