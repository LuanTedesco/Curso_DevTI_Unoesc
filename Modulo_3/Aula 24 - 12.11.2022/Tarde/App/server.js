const express = require('express')
const cors = require('cors')
const { restart } = require('nodemon')

const app = express()
const porta = 8080

// Configuração do CORS
app.use(cors({ origin: '*' }))

// Instancia o servidor
app.listen(porta, () => console.log(`Servidor iniciado na porta ${porta}`))

function dormir(ms) {
  return new Promise(resolve => setTimeout(resolve, ms))
}
let estado
app.get('/processa-requisicao', function (req, res) {
  dormir(3000).then(() => {
    res.status(200).send((estado = document.querySelector('#estado').value))
  })
})

app.get('/devolve-json', function (req, res) {
  // Recupera a variável 'nome' passado através da requisição GET
  if (estado == 'PR') {
    const cidade = req.query['PR']
    console.log(PR)
  } else if (estado == 'SC') {
    const cidade = req.query['SC']
    console.log(SC)
  } else {
    const cidade = req.query['RS']
    console.log(RS)
  }

  // Monta o objeto literal
  const PR = {
    cidade1: Curitiba,
    cidade2: Guarapuava,
    cidade3: Cidade3
  }
  const SC = {
    cidade1: Joaçaba,
    cidade2: Herval,
    cidade3: Luzerna
  }
  const RS = {
    cidade1: PortoAlegre,
    cidade2: Gramado,
    cidade3: Canela
  }

  // Devolve a resposta ao navegador em formato JSON
  // Define o código de status como sendo 201
  res.status(201).json(cidade)
})
