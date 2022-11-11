function gravar() {
  var titulo = document.getElementById('txtTitulo').value
  var div = document.getElementById('divResultado')

  div.innerHTML = '<h1>' + titulo + '</h1>'
}
