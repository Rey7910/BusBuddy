import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeUsuarioComponent } from './home-usuario/home-usuario.component';
import { RegisterComponent } from './register/register.component';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ToastrModule } from 'ngx-toastr';
import { HomePageComponent } from './home-page/home-page.component';
import { AsignarRutasEmpresaComponent } from './asignar-rutas-empresa/asignar-rutas-empresa.component';
import { MisRutasComponent } from './mis-rutas/mis-rutas.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeUsuarioComponent,
    LoginComponent,
    RegisterComponent,
    HomePageComponent,
    AsignarRutasEmpresaComponent,
<<<<<<< HEAD
    MisRutasComponent
=======
    CompraTiqueteComponent
>>>>>>> 70e7779c857a67c9990d7bf1af616c48c3824cab
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    BrowserAnimationsModule, // required animations module
    ToastrModule.forRoot() // ToastrModule added
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

