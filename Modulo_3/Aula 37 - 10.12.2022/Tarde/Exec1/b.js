const carrinho = [
  '{ "nome": "Borracha", "preco": 3.45 }',
  '{ "nome": "Caderno", "preco": 13.90 }',
  '{ "nome": "Lápis", "preco": 2.5 }',
  '{ "nome": "Caneta", "preco": 7.5 }'
]

const carrinhos = carrinho.map(e => JSON.parse(e))
console.log(carrinhos)
