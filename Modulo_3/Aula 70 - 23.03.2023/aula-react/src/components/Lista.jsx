function Lista() {
  const pessoas = [
    { nome: 'Pedro', sexo: 'M', idade: 20 },
    { nome: 'Herculano', sexo: 'M', idade: 48 },
    { nome: 'Fulana', sexo: 'F', idade: 21 }
  ]

  return (
    <div>
      <h1>Lista</h1>

      {pessoas.map((pessoa, index) => (
        <div key={index}>
          <h3>
            ID: {index + 1} | Nome: {pessoa.nome} | Sexo: {pessoa.sexo} | Idade:{' '}
            {pessoa.idade}
          </h3>
        </div>
      ))}
    </div>
  )
}

export default Lista
