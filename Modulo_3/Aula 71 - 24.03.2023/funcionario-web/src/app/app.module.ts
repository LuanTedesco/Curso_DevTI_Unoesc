import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from 'src/app/app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { AppComponent } from './app.component';
import { CoreModule } from 'src/app/core.module';

@NgModule({
    declarations: [
        AppComponent
    ],
    imports: [
        CoreModule, AppRoutingModule, ReactiveFormsModule, BrowserModule


    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
