const FRONT = 'http://localhost:5500/';
const API = 'http://localhost:8081/api/funcionarios/';

window.onload = function (e) {
    listarFuncionarios();
};

function criarTabela(funcionarios) {
    const corpoTabela = document.querySelector('#funcionarios');
    corpoTabela.innerHTML = '';

    if (funcionarios) {
        const linhas = funcionarios.map(funcionario => {
            const tdId = document.createElement('td');
            tdId.innerHTML = funcionario.id;
    
            const tdNome = document.createElement('td');
            tdNome.innerHTML = funcionario.nome;
    
            const tdNumDep = document.createElement('td');
            tdNumDep.innerHTML = funcionario.numDep;

            const tdNasc = document.createElement('td');
            
            const tdSalario = document.createElement('td');
            tdSalario.innerHTML = funcionario.salario.toLocaleString('pt-BR', 
                                                                    { 
                                                                        currency: 'BRL', 
                                                                        style: 'currency'
                                                                    });
    
            // Trabalha com a classe LocalDateTime no back-end Java
            // let data = new Date(funcionario.nascimento);
            // tdNasc.innerHTML = data.toLocaleDateString("pt-BR", {timeZone: "America/Sao_Paulo"});
            
            // Trabalha com a classe LocalDate no back-end Java
            let data = new Date(funcionario.nascimento);
            tdNasc.innerHTML = new Date(funcionario.nascimento+'T00:00:00').toLocaleDateString("pt-BR");
            
            // Biblioteca Moment.js: Trabalha com LocalDate
            // moment.locale('pt-br');
            // let data = new moment(funcionario.nascimento).format('L');
            // tdNasc.innerHTML = data;

            console.log('nascimento:', funcionario.nascimento);
            console.log('data:', data);

            const acaoAlterar = document.createElement('a');
            acaoAlterar.innerHTML = 'Alterar';
            acaoAlterar.setAttribute('href', FRONT + 'alterar_funcionario.html?id=' + funcionario.id);
            acaoAlterar.classList.add('btn', 'btn-primary', 'me-2');
    
            const acaoExcluir = document.createElement('a');
            acaoExcluir.innerHTML = 'Excluir';
            acaoExcluir.classList.add('btn', 'btn-danger');

            acaoExcluir.addEventListener('click', function (event) {
                if (confirm('Tem certeza que deseja excluir?')) {
                    axios.delete(API + funcionario.id, { })
                        .then(res => {
                            //alert(res.data.mensagem);
                            listarFuncionarios();
                        });
                } 
            }, false);
    
            const tdAcoes = document.createElement('td');
            tdAcoes.appendChild(acaoAlterar);
            tdAcoes.appendChild(acaoExcluir);
    
            const tr = document.createElement('tr');
            tr.appendChild(tdId);
            tr.appendChild(tdNome);
            tr.appendChild(tdNumDep);
            tr.appendChild(tdSalario);
            tr.appendChild(tdNasc);
            tr.appendChild(tdAcoes);
    
            return tr;
        });
        
        linhas.forEach(linha => corpoTabela.appendChild(linha));
    }
}

async function listarFuncionarios() {
    const res = await axios.get(API, {});

    console.log('Resposta do servidor:', res);
    criarTabela(res.data);
}

function getLocalISOString(date) {
    const offset = date.getTimezoneOffset()
    const offsetAbs = Math.abs(offset)
    const isoString = new Date(date.getTime() - offset * 60 * 1000).toISOString()
    return `${isoString.slice(0, -1)}${offset > 0 ? '-' : '+'}${String(Math.floor(offsetAbs / 60)).padStart(2, '0')}:${String(offsetAbs % 60).padStart(2, '0')}`
  }