const express = require('express');
const cors = require('cors');
const formData = require('express-form-data');

const app = express();
const porta = 8082;

// Configura o CORS
app.use(cors({ origin: '*' }));

// Configura o tratamento das requisições POST
app.use(express.urlencoded({extended: true}));
app.use(express.json());

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

// Tratamento de requisição GET convencional
app.get('/axios', function(req, res) {
    const n1 = parseInt(req.query['n1']);
    const n2 = parseInt(req.query['n2']);

    console.log('axios - get:', n1, n2);

    res.send({ resultado: n1 + n2 });
});

// Versão alternativa de tratamento da requisição GET
app.get('/axiosParams', function(req, res) {
    const n1 = parseInt(req.query.n1);
    const n2 = parseInt(req.query.n2);

    console.log('axiosParams - get:', n1, n2);

    res.send({ resultado: n1 + n2 });
});

// Tratamento de requisição POST convencional
app.post('/axios', function(req, res) {
    const n1 = parseInt(req.body.n1);
    const n2 = parseInt(req.body.n2);

    console.log('axios - post:', n1, n2);

    res.send({ resultado: n1 + n2 });
});

// Tratamento de POST no formato multipart/form-data
app.post('/axiosFD', function(req, res) {
    const n1 = parseInt(req.body.n1);
    const n2 = parseInt(req.body.n2);

    console.log('axiosFD - post:', n1, n2);

    res.send({ resultado: n1 + n2 });
});

// Tratamento de requisição PUT
app.put('/axios', function(req, res) {
    const operacao = req.body.operacao;

    console.log('axios - put:', operacao);

    res.send({ resultado: operacao + ' efetuada com sucesso!' });
});

// Tratamento de requisição DELETE
app.delete('/axios', function(req, res) {
    const operacao = req.body.operacao;

    console.log('axios - delete:', operacao);

    res.send({ resultado: operacao + ' efetuada com sucesso!' });
});