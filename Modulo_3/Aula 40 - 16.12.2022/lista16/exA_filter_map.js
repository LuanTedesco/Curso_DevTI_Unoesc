// filter.js
const produtos = [
    {nome: 'Notebook Samsumg', preco: 4999,  vendido: true,  tipo: 'notebook'},
    {nome: 'Notebook Sony',    preco: 5999,  vendido: false, tipo: 'notebook'},
    {nome: 'iPad',             preco: 6999,  vendido: false, tipo: 'tablet'},
    {nome: 'iPhone',           preco: 7999,  vendido: true,  tipo: 'smartphone'},
    {nome: 'Copo de plástico', preco: 1.99,  vendido: false, tipo: 'copo'},
    {nome: 'Copo de vidro',    preco: 10.99, vendido: true,  tipo: 'copo'},
];

console.table(produtos);

console.log(produtos.filter(produto => produto.preco > 5000));
console.log('Produtos preco>5000:', produtos.filter(produto => produto.preco > 5000)
                                            .map(produto => produto.nome));

const vendidos = produtos.filter(produto => produto.vendido)
                         .map(produto => produto.nome);
console.log('Produtos vendidos:', vendidos);

const caro = produto => produto.preco>5000;
const vendido = produto => produto.vendido;
console.log(produtos.filter(caro).filter(vendido));