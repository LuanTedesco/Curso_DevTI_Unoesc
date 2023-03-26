import { Component, OnInit } from '@angular/core';
import { fadeAnimation } from 'src/app/animation';
import { FuncionariosApi } from 'src/app/api/funcionarios.api';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  animations: [fadeAnimation]
})


export class AppComponent  implements OnInit {
  title = 'funcionarios-web';
 constructor(private funcionariosApi: FuncionariosApi) {

    }

    ngOnInit() {
    // this.funcionariosApi.adquirirTodos().subscribe(retorno =>{debugger});
    }



}
