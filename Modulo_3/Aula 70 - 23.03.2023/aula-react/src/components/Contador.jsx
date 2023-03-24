import React, { useState } from 'react'

function Contador() {
  const [contador, setContador] = useState(0)
  const [mostrarContador, setMostrarContador] = useState(true)

  function aumentarContador() {
    setContador(contador + 1)
  }

  function diminuirContador() {
    setContador(contador - 1)
  }

  function zerarContador() {
    setContador(0)
  }

  function alterarVisualizacaoContador() {
    setMostrarContador(!mostrarContador)
  }

  return (
    <div>
      <button onClick={alterarVisualizacaoContador}>
        Alterar visualização do contador
      </button>
      {mostrarContador === true && (
        <>
          <h3>{contador}</h3>
          <button onClick={aumentarContador}> + </button>
          <button onClick={diminuirContador}> - </button>
          <button onClick={zerarContador}> 0 </button>
        </>
      )}
    </div>
  )
}

export default Contador
