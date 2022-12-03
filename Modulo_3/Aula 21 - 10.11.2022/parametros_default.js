// Função convencional com valor default
function somar(a = 0, b = 0) {
    return a + b;
}

console.log(somar(40, 2));
console.log(somar(42));
console.log(somar());

console.log('');

// Arrow function com valor default
const saudacao = (pessoa = 'Fulano', saudacao = 'Olá') => {
    console.log(saudacao, pessoa);
};

saudacao('Beltrano');
saudacao('Sicrano', 'Oi');
saudacao(undefined, 'E aí');