import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { ListagemRoutingModule } from 'src/app/modules/Funcionario/listagem/listagem.routing.module';
import { ListagemComponent } from 'src/app/modules/Funcionario/listagem/page/listagem.component';


@NgModule({
    imports: [ListagemRoutingModule, CommonModule, ReactiveFormsModule],
    declarations: [ListagemComponent]

})
export class ListagemModule { }
