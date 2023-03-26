
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FuncionariosApi } from 'src/app/api/funcionarios.api';
import { RotasConstant } from 'src/app/constants/rotas.constant';
import { FuncionarioDTO } from 'src/app/models/funcionario.dto';




@Component({
    templateUrl: './listagem.component.html',
    styleUrls: ['./listagem.component.scss']
})
export class ListagemComponent implements OnInit {

    listaFuncinarios: FuncionarioDTO[] = [];
    constructor(private funcionariosApi: FuncionariosApi, private router: Router,) { }

    ngOnInit() {
        debugger
        this.funcionariosApi.adquirirTodos().subscribe(retorno => {
            this.listaFuncinarios = retorno
        });
    }

    navegarCadastro() {
        this.router.navigate([RotasConstant.CADASTRO]);
    }
}
