let id, idForm, nomeForm, ndepenForm, salarForm
const sURL = 'http://localhost:8081/api/funcionario/'

window.onload = async function (e) {
  const query = window.location.search
  const parametros = new URLSearchParams(query)
  id = parametros.get('id')

  idForm = document.querySelector('#iID')
  nomeForm = document.querySelector('#iNome')
  ndepenForm = document.querySelector('#iNumeroDependentes')
  salarForm = document.querySelector('#iSalario')

  const funcionario = await buscarFuncionario(id)
  preencherForm(funcionario)
}

function preencherForm(funcionario) {
  idForm.value = funcionario.id
  nomeForm.value = funcionario.nome
  ndepenForm.value = funcionario.numeroDependentes
  salarForm.value = funcionario.salario
}

async function buscarFuncionario(id) {
  const resposta = await axios.get(sURL + id)

  return resposta.data
}

async function alterarFuncionario() {
  const id = idForm.value
  const nome = nomeForm.value
  const numeroDependentes = ndepenForm.value
  const salario = salarForm.value

  if (!id || !nome || !numeroDependentes || !salario) {
    return alert('Preencha os campos obrigatórios.')
  }

  axios
    .put(sURL, { id, nome, numeroDependentes, salario })
    .then(res => {
      alert(JSON.stringify(res.data))
      console.log(res.data)
      setTimeout(() => (window.location.href = '/'), 100)
    })
    .catch(res => console.log(res.response.data))
}
