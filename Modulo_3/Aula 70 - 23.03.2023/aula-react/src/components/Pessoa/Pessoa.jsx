import { useState } from 'react'
import styles from './style.module.css'

function Pessoa(props) {
  const [verificado, setVerificado] = useState(false)
  const pessoa = props.pessoa

  function alternarVerificado() {
    setVerificado(!verificado)
  }

  return (
    <div className="styles.container">
      <h3>Nome: {pessoa.nome}</h3>
      <h3>Sexo: {pessoa.sexo}</h3>
      <h3>Idade: {pessoa.idade}</h3>
      <input onClick={alternarVerificado} type="checkbox" />
      {verificado ? (
        <bold>Verificado</bold>
      ) : (
        <span className={styles.naoVerificado}>Não Verificado</span>
      )}
    </div>
  )
}

export default Pessoa
