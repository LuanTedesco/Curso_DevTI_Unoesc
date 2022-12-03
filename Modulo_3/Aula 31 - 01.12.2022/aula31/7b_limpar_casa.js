let limparQuarto = new Promise((resolve, reject) => {
    resolve('Limpei o quarto! ');
});

let retirarLixo = function (mensagem) {
    return new Promise((resolve, reject) => {
        resolve(mensagem + '-> Retirei o lixo! ')
    });
};

let ganharSorvete = function (mensagem) {
    return new Promise((resolve, reject) => {
        resolve(mensagem + '-> Ganhei sorvete! ')
    });
};

limparQuarto.then(resultado => {
    return retirarLixo(resultado);
}).then(resultado => {
    return ganharSorvete(resultado);
}).then(resultado => {
    console.log(resultado + '-> Fim!');
});

Promise.all([limparQuarto, retirarLixo(), ganharSorvete()])
    .then(() => console.log('Todas as tarefas foram finalizadas!'));

Promise.any([limparQuarto, retirarLixo(''), ganharSorvete('')])
    .then(tarefa => console.log(`Uma das tarefas - ${tarefa}- encerrada!\n`));