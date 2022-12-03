let valor = 0,
  cronometro

function testarSetTimeout() {
  setTimeout(function () {
    document.getElementById('timeOut').innerHTML = '*** BUMMM !!! ***'
  }, 500)
}

function iniciarCronometro() {
  cronometro = setInterval(function () {
    valor++
    document.getElementById('intervalo').innerHTML = valor
  }, 1000)
}

function pausarCronometro() {
  clearInterval(cronometro)
}

function reiniciarCronometro() {
  valor = 0
  document.getElementById('intervalo').innerHTML = valor
  clearInterval(cronometro)
}
