import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeUsuarioComponent } from './home-usuario/home-usuario.component';
import { RegisterComponent } from './register/register.component';
import { HomePageComponent } from './home-page/home-page.component';
import { AsignarRutasEmpresaComponent } from './asignar-rutas-empresa/asignar-rutas-empresa.component';
import {MisRutasComponent} from './mis-rutas/mis-rutas.component';
import { CompraTiqueteComponent } from './compra-tiquete/compra-tiquete.component';
import { SettingsComponent } from './settings/settings.component';
import { PersonalComponent } from './personal/personal.component';
import { MisTiquetesUsuarioComponent } from './mis-tiquetes-usuario/mis-tiquetes-usuario.component'
import { PaginaErrorComponent } from './pagina-error/pagina-error.component';

const routes: Routes = [
  {
    path: 'login',
    component: LoginComponent,
},
{
  path: 'home-page',
  component: HomePageComponent,
},
{
  path: 'mis-rutas',
  component: MisRutasComponent,
},
{
  path: '',
  redirectTo: 'home-page',
  pathMatch: 'full',
},
{
    path: 'home-usuario',
    component: HomeUsuarioComponent,
  },
  {
    path: 'register',
    component: RegisterComponent,
  },
  {
    path: 'asignar-rutas-empresa',
    component: AsignarRutasEmpresaComponent,
  },
  {
    path: 'compra-tiquete',
    component: CompraTiqueteComponent,
  },
  {
    path: 'settings',
    component: SettingsComponent,
  },
  {
    path: 'personal',
    component: PersonalComponent,
  },
  {
    path: 'mis-tiquetes-usuario',
    component: MisTiquetesUsuarioComponent,
  },
  {
    path: 'pagina-error',
    component: PaginaErrorComponent,
  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

