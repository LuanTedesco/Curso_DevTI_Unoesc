function soma(x, y) {
  //funções construtoras e tratamentos de erros
  if (typeof x !== 'number' || typeof y !== 'number') {
    throw new ReferenceError('mensagem: x e y precisam ser numeros')
  }
  return x + y
}

try {
  console.log(soma(1, 2))
  console.log(soma(1, 2))
  //console.log(soma('1',2)); //para gerar erro
} catch (error) {
  console.log(error)
} finally {
  console.log('eu sempre sou executado com ou sem erro')
}
