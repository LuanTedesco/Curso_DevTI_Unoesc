//Classes em Js pode ser tratada da mesma forma que uma função construtura
//Vamos fazer uma função construtura
const pessoa = new Object()
pessoa.nome = 'Fran'
pessoa.sobrenome = 'Petry'
pessoa.idade = 30

pessoa.falarNome = function () {
  //método
  console.log(`${this.nome} Está falando seu Nome`)
}
//console.log(pessoa)
pessoa.falarNome() // métodos que são ações que um objeto pode realizar

pessoa.getDataNascimento = function () {
  //método
  const dataAtual = new Date()
  return dataAtual.getFullYear() - this.idade
}

console.log(pessoa.getDataNascimento())

for (let chave in pessoa) {
  console.log(pessoa[chave]) // chave de valor e as functions que estão dentro dos objetos chamamos de métodos
}

function Pessoa(nome, sobrenome, idade) {
  this.nome = nome
  this.sobrenome = sobrenome
  this.idade = idade

  Object.defineProperty(this, 'idade', {
    enumerable: true,
    configurable: true,
    get: function () {
      return idade
    },
    set idade(valor) {
      numero = valor
    }
  })
}

const p1 = new Pessoa('Fran', 'Petry', 30) //construtor (Pessoa), é a função que construiu o objeto
p1.numero = 32
console.log(p1)

//Classes

//exemplo usando Symbol para proteger o dado Idade.

const idade_ = Symbol('idade') //criar uma chave privada (propriedade Privada) usando Symbol, não precisa usar new
class Pessoa {
  constructor(nome, sobrenome) {
    this.nome = nome
    this.sobrenome = sobrenome
    this[idade_] = 30
  }

  falar() {
    console.log(`${this.nome} esta falando`) //Método
  }

  get idade() {
    return this[idade_] //Método
  }

  set idade(valor) {
    if (typeof valor !== 'number') return //Método
  }
}

const pessoa1 = new Pessoa('Fran', 'Petry') //instanciar uma pessoa = criar um objeto a partir da classe (new)
console.log(pessoa1)
pessoa1.falar()
pessoa1.idade = 31 // o valor idade não vai ser alterado, pq está encapsulado.. mesmo eu tentando forçar a mudança do valor
