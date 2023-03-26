import { environment } from 'src/environments/environment';

export const URL_BASE = `${environment.url}`;

const URL_CONTROLLER_FUNCIONARIOS = `${URL_BASE}/api/funcionarios`;

export class EndpointsConstant {
    static readonly FUNCIONARIOS = {
        buscarFuncionarios: `${URL_CONTROLLER_FUNCIONARIOS}`,
        salvarFuncionarios: `${URL_CONTROLLER_FUNCIONARIOS}`,

    };
}
