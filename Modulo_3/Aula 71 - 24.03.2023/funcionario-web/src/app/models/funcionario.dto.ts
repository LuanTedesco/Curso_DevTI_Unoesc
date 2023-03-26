export class FuncionarioDTO {
    id: number | undefined;
    nome: string;
    numDep: number;
    salario: number;
    nascimento: Date;


    constructor(nome: string, numDep: number, salario: number, nascimento: Date, id?: number) {
        this.id = id;
        this.nome = nome;
        this.numDep = numDep;
        this.salario = salario;
        this.nascimento = nascimento;
    }
}
