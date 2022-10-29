console.log("Hello 'word'");
console.log('Quebra "linha"');
//comentário de uma linha 
console.log('Meu nome é Fran estudo Js às', 19, 'horas'); // posso concatenar valores

/* comentario de bloco */


let nome; //declarou a variável
nome = "Franciele";
console.log(nome);
//não posso começar variáveis com números
//usar variáveis significativas
//não pode conter espaços e traços
//de preferencia começa com letra minúscula nomeSobrenome
//Js é case sensitive
// Não utilize Var, utilize let

const sobrenome =  "Petry";
console.log(sobrenome);
//não posso começar constantes com números
//usar variáveis significativas
//não pode conter espaços e traços
//utilizamos camelcase
// Não utilize Var, utilize const

//const idade = 29;
const peso = 70;
const altura = 1.63; // constante não muda de valor
let indiceMassaCorporal; // variável muda de valor ao decorrer do tempo

indiceMassaCorporal = peso/(altura * altura)

console.log("IMC = ", indiceMassaCorporal)

//const idade = 16;
/*if (idade >= 16 && idade < 18) {
	console.log("voto facultativo");
} */
//const idade=25;
if (idade >= 16 && idade < 18) {
	console.log("voto facultativo");
}else{
	console.log("voto obrigatório");
}

const n1=10;
const n2=20;
if (n1 > n2) {
    console.log("n1 :", n1, "é maior que n2 :", n2);
} else if (n1 < n2) {
    console.log("n1 :", n1, "é menor que n2 :", n2);
} else {
    console.log("n1 :", n1, "é igual a n2 :", n2);
}

const idade = 25;
switch (idade) {
	case (29): 
    console.log("Você está no auge.");
	break;
	case (40) : 
    console.log("A vida começa aqui.");
	break;
	case (60) : 
    console.log("Iniciando a melhor idade.");
	break;
	default: 
		console.log("A vida merece ser vivida, não importa a idade.");
	break;
}

const autenticado = false;

switch (autenticado) {
    case true:
        console.log("Usuário logado");
        break;
    case false:
        console.log("Usuário não autenticado");
}

const mes = "Outubro";

switch (mes) {
    case "Janeiro":
    case "Fevereiro":
    case "Março":
        console.log("Verão!");
        break;
    case "Abril":
    case "Maio":
    case "Junho":
        console.log("Outono!");
        break;
    case "Julho":
    case "Agosto":
    case "Setembro":
        console.log("Inverno!");
        break;
    case "Outubro":
    case "Novembro":
    case "Dezembro":
        console.log("Primavera!");
}

/* Exercício: Utilizando a estrutura switch case, faça:
1) Dado uma constante, classifique em: 1 - ADM, 2 - Professor e 3 - aluno, contendo uma mensagem para cada tipo de user.
2) Dado uma constante, reconheça o dia da semana.
3) Dado uma constante (1 - 12), forneça o nome do mês.*/

const usuario = 10;
switch (usuario) {
	case (1): 
    console.log("ADM.");
	break;
	case (2) : 
    console.log("PROFESSOR.");
	break;
	case (3) : 
    console.log("ALUNO.");
	break;
	default: 
		console.log("OPÇÃO INVALIDA");
	break;
}

const numSem = 0;

switch (numSem) {
	case 1:
		console.log('Domingo!');
		break;
	case 2:
		console.log('Segunda-feira');
		break;
	case 3:
		console.log('Terça-feira');
		break;
	case 4:
		console.log('Quarta-feira');
		break;
	case 5:
		console.log('Quinta-feira');
		break;
	case 6:
		console.log('Sexta-feira');
		break;
	case 3:
		console.log('Sábado');
		break;
	default:
		console.log('Acho que você errou a contagem!');
		break;
}

const mesNumero = 10;
switch (mesNumero) {
	case (1):
		console.log("Janeiro");
		break;
	case (2):
		console.log("Fevereiro");
		break;
	case (3):
		console.log("Março");
		break;
	case (4):
		console.log("Abril");
		break;
	case (5):
		console.log("Maio");
		break;
	case (6):
		console.log("Junho");
		break;
	case (7):
		console.log("Julho");
		break;
	case (8):
		console.log("Agosto");
		break;
	case (9):
		console.log("Setembro");
		break;
	case (10):
		console.log("Outubro");
		break;
	case (11):
		console.log("Novembro");
		break;
	case (12):
		console.log("Dezembro");
		break;
	default:
		console.log("Mês inválido!");
		break;
}



const types = [ 'object', 'array', 'string', 'integer', 'float', 'boolean' ]

for (const type of types) {  
  console.log(`um JavaScript é do tipo: ${type}`)
}

let names = [ 'Marcus', 'Norman', 'Christian', 'Fran' ]

for (const index in names) {  
  console.log(`${names[index]} está na posição ${index}`)
}

let numeros = [1, 2, 3, 4, 5];
	for (let i = 0; i < numeros.length; i++) {
			numeros[i] = numeros[i] + 2;
			console.log(numeros[i]);
	}

/* Exercício usando For:
1) Dada uma lista, imprima somente os numeros pares.
2) Dada uma lista, imprima somente os numeros ímpares.
 */

let listaNumeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
for (let i=0; i< listaNumeros.length; i++){
	if(listaNumeros[i]%2 != 0){
		console.log(listaNumeros[i])
	}
}

let exe1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

for (let i = 0; i < exe1.length; i++) {
    if (exe1[i] % 2 != 0){
        console.log(`${exe1[i]} é impar`)
    }
}

let numeros1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

for (let num = 0; num < numeros1.length; num++) {
	if (numeros1[num] % 2 == 0) {
		//let impar = numeros1[num];
		console.log('par ' + numeros1[num])
	} else {
		let pares = numeros1[num];
		console.log('ímpar ' + numeros1[num])
	}
}



let numero = 1;
	while (numero <= 5) {
			console.log("O número atual é: " + numero);
			numero = numero + 1;
	 }

const numeroS = [ 10, 11, 22, 23, 34, 45, 66, 17, 28, 93, 101 ];

let indeX = 0;

while (indeX < numeroS.length) {
  console.log('numero atual %s: ', numeroS[indeX]);
  indeX++;
}

let number = 1;
	do {
			console.log("O número atual é: " + number);
			number = number + 1;
	} while (number <= 5) ;



	const alunos = [
		{ aluno: 'João', nota: 10},
		{ aluno: 'Ana', nota: 8},
		{ aluno: 'Fernando', nota: 9},
		{ aluno: 'Bia', nota: 10},
	  ];
	  
	  let index = 0;
	  let somaDasNotas = 0;
	  let totalAlunos = alunos.length;
	  
	  do {
		somaDasNotas += alunos[index].nota;
	  
		index++;
	  } while (index < totalAlunos);
	  
	  let media = somaDasNotas / totalAlunos;
	  
	  console.log(media);

/* Exercício:
1) Usando while conte de 1 até 50, mostrando somente os números pares
2) Usando while conte de 1 até 50, somando somente os números pares
3) Usando while conte de 1 até 50, mostrando somente os números ímpares
4) Usando while conte de 1 até 50, somando somente os números ímpares
*/

num = 1
total = 0
while (num <= 50) {
	if(num % 2 == 0){
		console.log(num)
		total += num
	}
	num++
}
console.log(`A soma de todos os pares é ${total}`)

num = 1
total = 0
while (num <= 50) {
	if(num % 2 != 0){
		console.log(num)
		total += num
	}
	num++
}
console.log(`A soma de todos os pares é ${total}`)


function saudacao () {
    console.log("bom dia!")
}

saudacao();

/*O uso de crase(acento grave) indica que esta sendo declarado uma
 Template String, mas você pode declarar tanto com aspas,
  quanto aspas duplas ou o acento grave */

function saudacao (nome) {
    console.log(`bom dia ${nome}!`) // use crases 
    return 123456;
}

const variavel = saudacao("Fran");
console.log(variavel)

function soma(x,y){
    const resultado = x+y;
    return resultado;
}

const resultado = soma(1,10);
console.log(resultado);

/* Exercícios:
1) crie uma função que receba dois números e mostre qual é o maior e o menor.
2) Crie uma função que receba dois números e os multiplique.
3) Crie uma função que conte de 1 até 50, mostrando somente os números pares.
*/

function maiorOuMenor(x, y) {
	let resul = x * y; 

	if (x > y) {
		return `${x} é maior que ${y}, e o resultado da multiplicação entre eles é de ${resul}`;
	} else if (y > x) {
		return `${y} é maior que ${x}, e o resultado da multiplicação entre eles é de ${resul}`;
	} else {
		return `Os dois números são iguais, e o resultado da multiplicação entre eles é de ${resul}`;
	}
}

let resul = maiorOuMenor(3, 4);
console.log(resul);

function contar() {
	num = 1
	total = 0
	while (num <= 50) {
		if(num % 2 == 0){
			console.log(num)
			total += num
		}
		num++
	}
	console.log(`A soma de todos os pares é ${total}`)
}

let pares = contar();

function numbros (x, y) {
    return x > y ? console.log(`${x} é maior que ${y}`) : console.log(`${y} é maior que ${x}`) ;

}

numbros(2000,300)




  