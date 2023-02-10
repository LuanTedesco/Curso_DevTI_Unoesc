import Usuario, { imprimirNome, imprimirIdade as printAge} from './usuario.js';
// import { imprimirNome, imprimirIdade as printAge} from './usuario.js';

const fulano = new Usuario('Fulano', 42);
console.log(fulano);

imprimirNome(fulano);
printAge(fulano);