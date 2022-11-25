const express = require('express');
const cors = require('cors')

const app = express();
const porta = 8080;

// Configura o CORS
app.use(cors({ origin: '*' }));

// Instancia o servidor
app.listen(porta,
    () => console.log(`Servidor iniciado na porta: ${porta}`)
);

// Tratamento da requisição GET
app.get('/devolve-cidades', function (req, res) {
    const estado = req.query['estado'];
    let cidades = ['-- Selecione --'];

    switch (estado) {
        case 'PR': 
            cidades.push('Curitiba', 'Maringá', 'Ponta Grossa');
            break;
        case 'SC': 
            cidades.push('Joaçaba', 'São Miguel do Oeste', 'Videira', 'Xanxerê');
            break;
        case 'RS': 
            cidades.push('Porto Alegre', 'Passo Fundo', 'Santa Maria');
            break;
    }

    const resposta = { cidades };
    res.status(200).json(resposta);
});
