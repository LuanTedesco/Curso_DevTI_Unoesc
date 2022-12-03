let promessaDeLimparQuarto = new Promise((resolve, reject) => {
    /* Processo: Limpando o quarto
       .
       .
       .    */
    let estaLimpo = true;

    if (estaLimpo) {
        resolve('está limpo');
    } else {
        reject('não está limpo');
    }
});

promessaDeLimparQuarto.then(function(doResolve) {
    console.log('O quarto ' + doResolve)
}).catch(function(doReject) {
    console.log('O quarto ' + doReject)
});