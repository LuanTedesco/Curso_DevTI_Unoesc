const express = require('express')
const bodyParser = require('body-parser')

const app = express()
const porta = 8080

// Instancia o servidor
app.listen(porta, () => console.log(`Servidor iniciado na porta: ${porta}`))

app.use(bodyParser.urlencoded({ extended: true }))

// Responde a requisição no endereço http://localhost:8080/
app.get('/', (request, response) => {
  response.status(200).send('<h2>Exemplo de servidor node.js</h2>')
})

function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms))
}

// Tratamento da requisição GET
app.get('/processa-calc', function (req, res) {
  let email, senha

  email = req.query['email']
  senha = req.query['senha']

  // Faz uma pausa intencional
  sleep(1000).then(() => {
    processaRequisicao(res, email, senha)
  })
})

// Tratamento da requisição POST
// Exemplo com arrow function em vez de function convencional
// app.post('/processa-calc', (req, res) => {
//   let emailDefault = 'user@user.com'
//   let senhaDefault = '123'

//   let email = req.body.email
//   let senha = req.body.senha
//   let mensagem = verificaLogin(email, emailDefault, senha, senhaDefault)
//   processaRequisicao(res, mensagem)
// })

// app.post('/processa-calc', (req, res) => {
//   let emailDefault = [
//     'user@user.com',
//     'luan@luan.com',
//     'dely@dely.com',
//     '123@123.com',
//     '777@777.com'
//   ]
//   let senhaDefault = ['1', '456', '789', '111', '123456']

//   let email = req.body.email
//   let senha = req.body.senha
//   let mensagem

//   if (
//     emailDefault.indexOf(email) >= 0 &&
//     emailDefault.indexOf(email) == senhaDefault.indexOf(senha)
//   ) {
//     mensagem = 'Login autorizado'
//   } else {
//     mensagem = 'Login negado'
//   }

//   //let mensagem = verificaLogin(email, emailDefault, senha, senhaDefault)
//   processaRequisicao(res, mensagem)
// })

// app.post('/processa-calc', (req, res) => {
//   const login = {
//     usuarios: [
//       { emailDefault: 'user@user.com', senhaDefault: '1' },
//       { emailDefault: 'luan@luan.com', senhaDefault: '456' },
//       { emailDefault: 'dely@dely.com', senhaDefault: '789' },
//       { emailDefault: '123@123.com', senhaDefault: '111' },
//       { emailDefault: '777@777.com', senhaDefault: '123456' }
//     ]
//   }
//   let email = req.body.email
//   let senha = req.body.senha
//   let mensagem
//   comparSenha(res, email, senha, login.usuarios)
// })

// function comparSenha(res, email, senha, usuarios) {
//   usuarios.forEach(user => {
//     if (user.emailDefault == email && user.senhaDefault == senha) {
//       mensagem = 'Acesso consedido'
//       processaRequisicao(res, mensagem)
//     }
//   })
//   mensagem = 'Acesso negado'
//   processaRequisicao(res, mensagem)
// }

app.post('/processa-calc', (req, res) => {
  let email = req.body.email
  let senha = req.body.senha
  let mensagem
  // comparSenha(res, email, senha, login.usuarios)

  class Usuario {
    constructor(emailDefault, senhaDefault) {
      this.emailDefault = emailDefault
      this.senhaDefault = senhaDefault
    }

    // get emailDefault() {
    //   return this.emailDefault
    // }

    // set emailDefault(value) {
    //   return this.emailDefault
    // }

    autentica(res, email, senha, users) {
      users.forEach(user => {
        if (user.emailDefault == email && user.senhaDefault == senha) {
          mensagem = 'Acesso consedido'
          processaRequisicao(res, mensagem)
        }
      })
      mensagem = 'Acesso negado'
      processaRequisicao(res, mensagem)
    }
  }
  const u1 = new Usuario('user@user.com', '1')
  const u2 = new Usuario('luan@luan.com', '2')
  const u3 = new Usuario('dely@dely.com', '3')
  const u4 = new Usuario('123@123.com', '4')
  const u5 = new Usuario('777@777.com', '5')

  const users = [u1, u2, u3, u4, u5]

  for (let i = 0; i < users.length; i++) {
    users[i].autentica(res, email, senha, users)
  }
})

function comparSenha(res, email, senha, users) {
  usuarios.forEach(user => {
    if (user.emailDefault == email && user.senhaDefault == senha) {
      mensagem = 'Acesso consedido'
      processaRequisicao(res, mensagem)
    }
  })
  mensagem = 'Acesso negado'
  processaRequisicao(res, mensagem)
}

function processaRequisicao(res, mensagem) {
  mensagem = `<h3><div class="alert alert-primary">${mensagem}</div></h3>`

  HTML = `
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
            rel="stylesheet">
        <link rel="stylesheet" 
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" 
            crossorigin="anonymous">

        <div class="container" style="margin-top: 0.5rem">
            ${mensagem}

            <button type="button" onclick="window.history.back()" class="btn btn-outline-danger">
                <i class="fas fa-door-open"></i>
                Voltar
            </button>
            &nbsp
        </div>
    `

  res.send(HTML)
}
