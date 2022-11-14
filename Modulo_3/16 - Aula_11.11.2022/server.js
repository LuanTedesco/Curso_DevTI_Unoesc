const express = require('express');
const cors = require('cors');
const { restart } = require('nodemon');

const app = express();
const porta = 8080;

// Configuração do CORS
app.use(cors({origin: '*'}));

// Instancia o servidor
app.listen(porta, 
    () => console.log(`Servidor iniciado na porta ${porta}`)
);

function dormir(ms) {
    return new Promise(
        (resolve) => setTimeout(resolve, ms)
    )
}

app.get('/processa-requisicao', function(req, res) {
    dormir(3000).then( () => {
        res.status(200).send('<h2>Olá Mundo!!!</h2>');
    })
});

app.get('/devolve-json', function(req, res) {
    // Recupera a variável 'nome' passado através da requisição GET
    const nome = req.query['nome'];
    console.log(nome);
    
    // Monta o objeto literal
    const pessoa = {
        nome,
        idade: 42,
        salario: 123.45,
        data: new Date()
    };
    
    // Devolve a resposta ao navegador em formato JSON
    // Define o código de status como sendo 201
    res.status(201).json(pessoa);
});