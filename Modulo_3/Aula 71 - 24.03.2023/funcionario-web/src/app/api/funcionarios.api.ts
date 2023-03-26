import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';



import { EndpointsConstant } from 'src/app/constants/endpoints.constant';
import { FuncionarioDTO } from 'src/app/models/funcionario.dto';

@Injectable({ providedIn: 'root' })
export class FuncionariosApi {
    constructor(private http: HttpClient) { }

    adquirirTodos(): Observable<Array<FuncionarioDTO>> {
        return this.http.get<Array<FuncionarioDTO>>(EndpointsConstant.FUNCIONARIOS.buscarFuncionarios).pipe(
            map(funciorios => {
                debugger

                return funciorios;
            })
        );
    }

    salvar(funcionarioDTO: FuncionarioDTO): Observable<FuncionarioDTO> {
        return this.http.post<FuncionarioDTO>(EndpointsConstant.FUNCIONARIOS.salvarFuncionarios, funcionarioDTO);
    }


}
