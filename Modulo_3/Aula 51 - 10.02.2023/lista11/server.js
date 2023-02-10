const express = require('express');
const cors = require('cors');
// const path = require('path');

const app = express();
const porta = 8080;

// Configura o CORS
app.use(cors({ origin: '*' }));

// Configura o tratamento das requisições POST
app.use(express.urlencoded({extended: true}));
app.use(express.json());
// app.use(express.static('public'));
// app.use(express.static(path.join(__dirname, '/public')));

// Instancia o servidor
app.listen(porta, 
    () => console.log(`Servidor iniciado na porta: ${porta}`)
);

// Responde a requisição no endereço http://localhost:8080/
app.get('/', (request, response) => {
    response.status(200).send('<h2>Servidor node.js</h2>');
}); 

// Lê dados da requisição enviados por GET
function leDadosForm(req) {
    const email = req.query['nEmail'];
    const senha = req.query['nSenha'];

    return [ email, senha ];
}

app.get('/autentica-v1', function(req, res) {
    const email = 'herculano.debiasi@gmail.com';
    const senha = '1234';

    const [ emailForm, senhaForm ] = leDadosForm(req);

    const usuarioAutenticado = (email === emailForm && senha === senhaForm);

    // let usuarioAutenticado = false;
    // if (email === emailForm && senha === senhaForm) {
    //     usuarioAutenticado = true;
    // }

    retornaReposta(res, usuarioAutenticado); 
});

app.get('/autentica-v2', function(req, res) {
    const emails = ['fulano@gmail.com', 'beltrano@gmail.com', 'herculano.debiasi@gmail.com'];
    const senhas = ['123456', '12345', '1234'];

    const [ emailForm, senhaForm ] = leDadosForm(req);

    let usuarioAutenticado = false;
    for (let i = 0; i < emails.length; i++) {
        if (emails[i] === emailForm && senhas[i] === senhaForm) {
            usuarioAutenticado = true;
            break;
        } 
    }

    // console.log('Autentica com while() sem if()');
    // let i = 0;
    // while (!(usuarioAutenticado = (emails[i] === emailForm && senhas[i] === senhaForm)) && (i<emails.length)) {
    //     i++;
    // }

    // console.log('Autentica com for() sem if()');
    // for (let i = 0; 
    //     !(usuarioAutenticado = (emails[i] === emailForm && senhas[i] === senhaForm)) && i<emails.length; 
    //     i++) {
    // }

    retornaReposta(res, usuarioAutenticado); 
});

app.get('/autentica-v3', function(req, res) {
    const dados = {
        usuarios: [
            { email: 'Fulano', senha: '1234'},
            { email: 'Beltrano', senha: '4321'},
            { email: 'herculano.debiasi@gmail.com', senha: '1234'}
        ]
    };

    const [ emailForm, senhaForm ] = leDadosForm(req);

    let usuarioAutenticado = false;
    for (usuario of dados.usuarios) {
        if (usuario.email === emailForm && usuario.senha === senhaForm) {
            usuarioAutenticado = true;
            break;
        } 
    }

    retornaReposta(res, usuarioAutenticado); 
});

app.get('/autentica-v4', function(req, res) {
    class Usuario {
        #email;
        #senha;

        constructor(email, senha) {
            this.#email = email;
            this.#senha = senha;
        }

        get email() { return this.#email; }
        set email(email) { this.#email = email; }

        get senha() { return this.#senha; }
        set senha(senha) { this.#senha = senha; }

        autentica(email, senha) {
            return (email === this.#email && senha === this.#senha);
        }
    }

    const usuarios = [
        new Usuario('Fulano', '1234'),
        new Usuario('Beltrano', '4321'),
        new Usuario('herculano.debiasi@gmail.com', '1234')
    ];

    const [ emailForm, senhaForm ] = leDadosForm(req);

    let usuarioAutenticado = false;
    for (usuario of usuarios) {
        if (usuario.autentica(emailForm, senhaForm)) {
            usuarioAutenticado = true;
            break;
        } 
    }

    retornaReposta(res, usuarioAutenticado); 
});

// Tratamento da requisição POST
app.post('/autentica-v5-post', (req, res) => {
    const email = 'herculano.debiasi@gmail.com';
    const senha = '1234';

    const emailForm = req.body.nEmail;
    const senhaForm = req.body.nSenha;

    const usuarioAutenticado = (email === emailForm && senha === senhaForm);

    retornaReposta(res, usuarioAutenticado); 
});

app.get('/autentica-ajax', function(req, res) {
    const email = 'herculano.debiasi@gmail.com';
    const senha = '1234';
    
    const [ emailForm, senhaForm ] = leDadosForm(req);

    console.log(req);
    console.log(emailForm, senhaForm);
    const usuarioAutenticado = (email === emailForm && senha === senhaForm);

    retornaReposta(res, usuarioAutenticado); 
});

app.post('/autentica-ajax', function(req, res) {
    const email = 'herculano.debiasi@gmail.com';
    const senha = '1234';

    const emailForm = req.body.nEmail;
    const senhaForm = req.body.nSenha;

    const usuarioAutenticado = (email === emailForm && senha === senhaForm);

    retornaReposta(res, usuarioAutenticado); 
});

app.post('/autentica-ajax-json', function(req, res, next) {
    console.log('Recebendo os dados via POST');
    const email = 'herculano.debiasi@gmail.com';
    const senha = '1234';
    
    const emailForm = req.body.nEmail;
    const senhaForm = req.body.nSenha;
    
    if (email === emailForm && senha === senhaForm) {
        console.log('autenticado!');
        res.send('site.html');
    } else {
        console.log('Usuário ou senha incorretos!');
        res.send('erro.html');
        // res.sendFile(path.join(__dirname, '/public/erro.html'));
    }
});

function retornaReposta(res, usuarioAutenticado) {
    const msgAlert = `Usuário ${usuarioAutenticado ? '' : 'não'} autenticado!`;
    let tipoAlerta = usuarioAutenticado ? 'alert-success' : 'alert-danger';
    let mensagem = `<h3><div class="alert ${tipoAlerta}">${msgAlert}</div></h3>`;

    HTML = `
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" crossorigin="anonymous">

        <hr>
        <div class="container mt-2" id="msg">
            ${mensagem}
            
            <!--
            <button type="button" onclick="window.history.back()" class="btn btn-outline-danger">
                <i class="fas fa-door-open"></i>
                Voltar
            </button>
            -->
        </div>
    `;

    res.send(HTML);
}