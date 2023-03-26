
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RotasConstant } from 'src/app/constants/rotas.constant';

const routes: Routes = [
    {
        path: '',
        pathMatch: 'full',
        redirectTo: RotasConstant.LISTAGEM
    },
    {
        path: RotasConstant.LISTAGEM,
        loadChildren: () => import('./modules/Funcionario/listagem/listagem.module').then(m => m.ListagemModule),
        data: { animation: 'fade' }
    },
    {
        path: RotasConstant.CADASTRO,
        loadChildren: () => import('./modules/Funcionario/cadastro/cadastro.module').then(m => m.CadastroModule),
        data: { animation: 'fade' }
    },
    {
        path: '**',
        redirectTo: RotasConstant.LISTAGEM
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes, { useHash: true })],
    exports: [RouterModule]
})
export class AppRoutingModule { }
