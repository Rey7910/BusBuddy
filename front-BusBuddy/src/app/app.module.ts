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
import { CompraTiqueteComponent } from './compra-tiquete/compra-tiquete.component';
import { FormsModule } from '@angular/forms';
import{ServiceRutasService} from '../app/Service/service-rutas.service'
import { HttpClientModule } from '@angular/common/http';
import { ServiceTerminalService } from './Service/service-terminal.service';
import { SettingsComponent } from './settings/settings.component';
import { PersonalComponent } from './personal/personal.component';
import { MisTiquetesUsuarioComponent } from './mis-tiquetes-usuario/mis-tiquetes-usuario.component';
import { EstadisticasComponent } from './estadisticas/estadisticas.component';
import { PaginaErrorComponent } from './pagina-error/pagina-error.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeUsuarioComponent,
    LoginComponent,
    RegisterComponent,
    HomePageComponent,
    AsignarRutasEmpresaComponent,
    CompraTiqueteComponent,
    MisRutasComponent,
    SettingsComponent,
    PersonalComponent,
    MisTiquetesUsuarioComponent,
   EstadisticasComponent,
    PaginaErrorComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule, // required animations module
    ToastrModule.forRoot() // ToastrModule added
  ],
  providers: [ServiceRutasService,ServiceTerminalService],
  bootstrap: [AppComponent]
})
export class AppModule { }

