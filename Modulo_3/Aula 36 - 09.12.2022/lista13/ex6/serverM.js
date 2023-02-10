const express = require('express');
const cors = require('cors');
const formData = require('express-form-data');

const app = express();
const porta = 8081;

// Configura o CORS
app.use(cors({ origin: '*' }));

// Faz o parsing no formato multipart
app.use(formData.parse());

// Instancia o servidor
app.listen(porta, 
    () => console.log(`Servidor iniciado na porta: ${porta}`)
);

// Responde a requisição no endereço http://localhost:8080/
app.get('/', (request, response) => {
    response.status(200).send('<h2>Servidor node.js :-)</h2>');
});

// Tratamento da requisição via POST
app.post('/postM', function(req, res) {
    console.log('Servidor:', req.body);
    console.log('Servidor:', req.body.usuario);
    
    req.body.usuario = req.body.usuario.toUpperCase();

    if (req.body.usuario === '') {
        res.status(404).send({});
    } else {
        res.status(200).send(req.body);
    }
});