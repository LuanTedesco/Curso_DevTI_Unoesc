function verifyPassword() {
  let senha = document.querySelector('#senha').value
  let confSenha = document.querySelector('#confSenha').value

  if (senha == confSenha) {
    var pessoa = {
      nome: document.querySelector('#nome').value,
      endereco: document.querySelector('#endereco').value,
      email: document.querySelector('#email').value,
      nascimento: document.querySelector('#nascimento').value,
      salario: document.querySelector('#salario').value,
      senha: document.querySelector('#senha').value
    }
    console.table([pessoa])
  } else {
    alert('As senhas não conferem')
  }
}
