const produtos = [
  { nome: 'Notebook Samsumg', preco: 4999.99, vendido: true, tipo: 'notebook' },
  { nome: 'Notebook Sony', preco: 5999.99, vendido: false, tipo: 'notebook' },
  { nome: 'iPad', preco: 6999.99, vendido: false, tipo: 'tablet' },
  { nome: 'iPhone', preco: 7999.99, vendido: true, tipo: 'smartphone' },
  { nome: 'Copo de plástico', preco: 1.99, vendido: false, tipo: 'copo' },
  { nome: 'Copo de vidro', preco: 10.99, vendido: true, tipo: 'copo' }
]
console.table(produtos)

function retornaPreco(value) {
  if (value.preco > 5000) return value
}
var mostraPreco = produtos.filter(retornaPreco)

function retornaNome(value) {
  return value.nome
}
mostraPreco = mostraPreco.map(retornaNome)
// console.table(mostraPreco)
console.log(mostraPreco)
