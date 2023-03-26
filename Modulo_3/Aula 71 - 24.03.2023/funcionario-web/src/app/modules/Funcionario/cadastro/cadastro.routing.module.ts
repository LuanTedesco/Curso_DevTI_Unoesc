import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastroComponent } from 'src/app/modules/Funcionario/cadastro/page/cadastro.component';


const routes: Routes = [
    {
        path: '',
        component: CadastroComponent
    },
    {
        path: '**',
        redirectTo: ''
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class CadastroRoutingModule {}
