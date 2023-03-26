import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { CadastroRoutingModule } from 'src/app/modules/Funcionario/cadastro/cadastro.routing.module';

import { FormGroup, FormControl } from '@angular/forms';
import { CadastroComponent } from 'src/app/modules/Funcionario/cadastro/page/cadastro.component';
@NgModule({
    declarations: [
        CadastroComponent
    ],
    imports: [CommonModule, CadastroRoutingModule, ReactiveFormsModule]
})
export class CadastroModule { }
