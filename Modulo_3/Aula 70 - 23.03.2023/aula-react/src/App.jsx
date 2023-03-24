import React from 'react'
import Primeiro from './components/Primeiro'
import Contador from './components/Contador'
import Lista from './components/Lista'

function App() {
  return (
    <>
      <Primeiro titulo="Meu App React" descicao="descricao 1" />
      <Contador />
      <Lista />
    </>
  )
}

export default App
