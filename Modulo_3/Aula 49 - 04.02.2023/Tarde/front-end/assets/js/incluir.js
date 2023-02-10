let idForm, nomeForm, ndepenForm, salarForm
const sURL = 'http://localhost:8081/api/funcionarios/'

window.onload = function (e) {
  idForm = document.querySelector('#iID')
  nomeForm = document.querySelector('#iNome')
  ndepenForm = document.querySelector('#iNumeroDependentes')
  salarForm = document.querySelector('#iSalario')
}

async function incluirFuncionario() {
  const id = idForm.value
  const nome = nomeForm.value
  const numeroDependentes = ndepenForm.value
  const salario = salarForm.value

  if (!id || !nome || !numeroDependentes || !salario) {
    return alert('Preencha os campos obrigatórios.')
  }

  axios
    .post(sURL, { id, nome, numeroDependentes, salario })
    .then(res => {
      res.data.toString = function () {
        return (
          'ID: ' +
          this.id +
          '\nNome: ' +
          this.nome +
          '\nNumero Dependentes: ' +
          this.numeroDependentes +
          '\nSalario: ' +
          this.salario
        )
      }

      alert(res.data.toString())
      console.log(res.data)
      setTimeout(() => (window.location.href = '/'), 100)
    })
    .catch(res => console.log(res.response.data))
}
