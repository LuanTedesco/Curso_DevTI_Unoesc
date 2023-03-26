
import { CommonModule, registerLocaleData } from '@angular/common';
import { HTTP_INTERCEPTORS, HttpClientModule } from '@angular/common/http';
import pt from '@angular/common/locales/pt';
import { ErrorHandler, NgModule, Optional, SkipSelf } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';



registerLocaleData(pt);



@NgModule({
    imports: [CommonModule, BrowserModule, BrowserAnimationsModule, HttpClientModule, ReactiveFormsModule, FormsModule],
    exports: [BrowserAnimationsModule, HttpClientModule, ReactiveFormsModule, FormsModule]
})
export class CoreModule {
    constructor(@Optional() @SkipSelf() parentModule: CoreModule) {
        if (parentModule) {
            throw new Error('CoreModule já foi carregado. Importe o CoreModule somente no AppModule.');
        }
    }
}
