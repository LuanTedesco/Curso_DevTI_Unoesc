let Carro = function() {
    this.cor = 'Azul';
    this.modelo = 'Chevette';
    this.velocidadeAtual = 0;
    let velocidadeMaxima = 100;

    this.acelerar = function() { 
        this.velocidadeAtual += 40;

        if (this.velocidadeAtual > getVelocidadeMaxima()) {
            this.velocidadeAtual = velocidadeMaxima;
        }
    }

    this.setVelocidadeAtual = function(velocidade) { 
        this.velocidadeAtual = velocidade; 
    }

    let getVelocidadeMaxima = function() {
        return velocidadeMaxima;
    }
}

Carro.prototype.getVelocidadeAtual = function() { 
    return this.velocidadeAtual; 
}

let carro = new Carro()

console.log(typeof Carro);
console.log(typeof carro);
console.log(Carro);
console.log(carro);

carro.acelerar();
console.log(carro.getVelocidadeAtual());

carro.setVelocidadeAtual(50);
console.log(carro.getVelocidadeAtual());

carro.acelerar();
carro.acelerar();
carro.acelerar();
console.log(carro.getVelocidadeAtual());