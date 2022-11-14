// ES5
const criarAdicao = function(a) {
    return function(b) {
        return a + b;
    }
}

const somador = criarAdicao(41);
console.log(somador(1));
console.log(somador(2));
console.log('----');

//  ES6 (ECMA2015)
const adicionar = (a, b) => a + b;
const criarAdicaoAF = a => b => adicionar(a, b);
const somadorAF = criarAdicaoAF(41);
console.log(somadorAF(1));
console.log(somadorAF(2));