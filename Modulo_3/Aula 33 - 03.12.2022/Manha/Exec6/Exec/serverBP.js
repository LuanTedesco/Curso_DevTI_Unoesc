const express = require('express')
const cors = require('cors')

const app = express()
const porta = 8080

app.use(cors({ origin: '*' }))

app.use(express.urlencoded({ extended: true }))
app.use(express.json())

app.listen(porta, () => console.log(`Servidor iniciado na porta: ${porta}`))

app.get('/', (request, response) => {
  response.status(200).send('<h2>Servidor node.js :-) </h2>')
})

app.post('/postBP', function (req, res) {
  console.log('Servidor:', req.body)
  console.log('Servidor:', req.body.usuario)

  req.body.usuario = req.body.usuario.toUpperCase()

  if (req.body.usuario === '') {
    res.status(404).send({})
  } else {
    res.status(200).send(req.body)
  }
})
