function somar(x, y) {
    return x + y;
}

function subtrair(x, y) {
    return x - y;
}

function calcular(a, b, operacao) {
    return operacao(a, b);
} 

console.log(calcular(2, 1, somar));
console.log(calcular(2, 1, subtrair));