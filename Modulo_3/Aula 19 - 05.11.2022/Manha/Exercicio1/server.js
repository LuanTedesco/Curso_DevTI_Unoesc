const express = require('express')

const app = express()
const porta = 8080

app.listen(porta, () => console.log(`Servidor iniciado na porta: ${porta}`))

app.get('/', (request, response) => {
  response.status(200).send('<h2>Exemplo de servidor node.js</h2>')
})

function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms))
}

// Tratamento da requisição GET
app.get('/result', function (req, res) {
  let valor

  valor = req.query['valor']

  valor = valor.split('').reverse().join('')

  sleep(100).then(() => {
    processaRequisicao(res, valor)
  })
})

function processaRequisicao(res, valor) {
  HTML = `<h3> ${valor} </h3>`

  res.send(HTML)
}
