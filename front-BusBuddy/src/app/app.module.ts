import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { HomeUsuarioComponent } from './home-usuario/home-usuario.component';
=======
import { LoginComponent } from './login/login.component';
>>>>>>> 6e358fc95d1130bbdaeab04c33032fa60f812e49

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    HomeUsuarioComponent
=======
    LoginComponent
>>>>>>> 6e358fc95d1130bbdaeab04c33032fa60f812e49
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
