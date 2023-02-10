export default class Usuario {
    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

export function imprimirNome(usuario) {
    console.log(`O nome do usuário é ${usuario.nome}`);
}

export function imprimirIdade(usuario) {
    console.log(`${usuario.nome} tem ${usuario.idade} anos`);
}

// export { imprimirNome, imprimirIdade };