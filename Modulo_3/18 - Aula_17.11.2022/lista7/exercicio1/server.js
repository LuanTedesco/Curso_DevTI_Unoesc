const express = require('express');

const app = express();
const porta = 8080;

// Instancia o servidor
app.listen(porta, 
    () => console.log(`Servidor iniciado na porta: ${porta}`)
);

// Responde a requisição no endereço http://localhost:8080/
app.get('/', (request, response) => {
    response.status(200).send('<h2>Exemplo de servidor node.js</h2>');
});

// Tratamento da requisição GET
app.get('/converte-texto', function(req, res) {
    const texto = req.query['texto'];
    const dividido = texto.split(''); 
    const reverso = dividido.reverse();
    const texto_final = reverso.join('');
    
    HTML = `
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
            rel="stylesheet">
        <link rel="stylesheet" 
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" 
            crossorigin="anonymous">

            <style>
                <h1>
            </style>

        <div class="container" style="margin-top: 0.5rem">
        <h1>${texto_final}</h1>

            <button type="button" onclick="window.history.back()" class="btn btn-outline-danger">
                <i class="fas fa-door-open"></i>
                Voltar
            </button>
            
        </div>
    `;

    res.send(HTML);
});