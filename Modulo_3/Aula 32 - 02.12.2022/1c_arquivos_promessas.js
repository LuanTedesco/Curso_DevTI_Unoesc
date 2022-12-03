const fs = require('fs')
const learquivo = arquivo =>
  new Promise((resolve, reject) => {
    fs.readFile(arquivo, (erro, conteudo) => {
      if (erro) {
        reject(erro)
      } else {
        resolve(conteudo)
      }
    })
  })

learquivo('./in1.txt').then(conteudo => console.log(String(conteudo)))
