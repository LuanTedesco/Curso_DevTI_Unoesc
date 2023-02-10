let id, idForm, nomeForm, numDepForm, slrForm, nascForm;
const sURL = 'http://localhost:8081/api/funcionarios/';

window.onload = async function (e) {
    const query = window.location.search;
    const parametros = new URLSearchParams(query);
    id = parametros.get('id');

    idForm = document.querySelector('#iID');
    nomeForm = document.querySelector('#iNome');
    numDepForm = document.querySelector('#iNumDependentes');
    slrForm = document.querySelector('#iSalario');
    nascForm = document.querySelector('#iNascimento');

    const funcionario = await buscarFuncionario(id);
    preencherForm(funcionario);
};

function preencherForm(funcionario) {
    idForm.value = funcionario.id;
    nomeForm.value = funcionario.nome;
    numDepForm.value = funcionario.numDep;
    slrForm.value = funcionario.salario;
    nascForm.value = funcionario.nascimento;
}

async function buscarFuncionario(id) {
    const resposta = await axios.get(sURL + id);

    return resposta.data;
}

async function alterarFuncionario() {
    const id = idForm.value;
    const nome = nomeForm.value; 
    const numDep = numDepForm.value;
    const salario = slrForm.value;
    const nascimento = nascForm.value;

    axios.put(sURL, { id, nome, numDep, salario, nascimento })
        .then(res => {
            alert(JSON.stringify(res.data));
            console.log(res.data);
            setTimeout(() => window.location.href = '/', 100);
        })
        .catch(res => console.log(res.response.data));
}