const botao =document.querySelector('button');

botao.addEventListener('click', function(e){
    document.querySelector('#span').textContent = document.getElementById("texto").value;
})

const mudarCor =document.getElementById('btn2');


mudarCor.addEventListener('click', function(e){
    let cor=document.getElementById("divCor");
    cor.style.backgroundColor = 'blue';
})