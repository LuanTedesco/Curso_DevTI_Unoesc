let idForm, nomeForm, numDepForm, slrForm, nascForm;
const sURL = 'http://localhost:8081/api/funcionarios/';

window.onload = function (e) {
    idForm = document.querySelector('#iID');
    nomeForm = document.querySelector('#iNome');
    numDepForm = document.querySelector('#iNumDependentes');
    slrForm = document.querySelector('#iSalario');
    nascForm = document.querySelector('#iNascimento');
};

async function incluirFuncionario() {
    const id = idForm.value;
    const nome = nomeForm.value; 
    const numDep = numDepForm.value;
    const salario = slrForm.value;
    const nascimento = nascForm.value;

    axios.post(sURL, { id, nome, numDep, salario, nascimento })
        .then(res => {
            res.data.toString = function() {
                return 'ID: ' + this.id + '\nNome: ' + this.nome +
                    '\n# Dependentes: ' + this.numDep + '\nSalário: ' + this.salario +
                    '\nNascimento: ' + this.nascimento;
                }

            alert(res.data.toString());
            console.log(res.data);
            setTimeout(() => window.location.href = '/', 100);
        })
        .catch(res => console.log(res.response.data));
}