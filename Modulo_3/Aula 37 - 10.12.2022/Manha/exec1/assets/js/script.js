let nomeCanal = 'unoescoficial'
let chave = 'AIzaSyBLMnDe_Zd3ejXyKQJka5ynomWs7NwO-M8'

$(document).ready(function () {
  Fancybox.bind('[data-fancybox-plyr]', {})
  console.log('jQuerry funcionando e script.js carregado!')

  $.get(
    'https://www.googleapis.com/youtube/v3/channels',
    {
      part: 'contentDetails',
      forUsername: nomeCanal,
      key: chave
    },
    dados => {
      let codigoUpload = dados.items[0].contentDetails.relatedPlaylists.uploads
      console.log(dados, 'Codigo de upload: ', codigoUpload)

      pegarVideos(codigoUpload)
    }
  )

  function pegarVideos(codigo) {
    $.get(
      'https://www.googleapis.com/youtube/v3/playlistItems',
      {
        part: 'snippet',
        maxResults: 12,
        playlistId: codigo,
        key: chave
      },
      dados => {
        // console.log(dados)

        $.each(dados.items, (_, item) => {
          let imagem, arquivo, dataPublicacao, descricao, video

          imagem = item.snippet.thumbnails.medium.url
          titulo = item.snippet.title

          moment.locale('pt')

          dataPublicacao = new moment(item.snippet.publishedAt).format(
            'DD [de] MMMM [de] YYYY'
          )

          descricao = item.snippet.description
          descricao = descricao.replace(
            /((https?|file|ftp):\/\/[\w?=&.\/-/#~%-]+(?![\w\s?&.\/;#]%"=-]*>))/g,
            '<a href="$1" target="_blank">$1</a>'
          )

          video = item.snippet.resourceId.videoId

          arquivo = `<li class="principal">
          <div class="foto">
          <a data-fancybox-plyr href="https://www.youtube.com/watch?v=${video}">
          <img src="${imagem}">
          </a>
          <div class="legenda">
          <h5>${titulo}</h5>
          <p>
          ${descricao}
          <br>
          Data de publicação: ${dataPublicacao}
          </p>
          </div>
          </div>
          </li>`

          // console.log(arquivo);
          console.log(arquivo)
          $('#janela ul').append(arquivo)
        })
      }
    )
  }
})
