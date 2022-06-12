import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeUsuarioComponent } from './home-usuario/home-usuario.component';
import { RegisterComponent } from './register/register.component';
import { HomePageComponent } from './home-page/home-page.component';
import { AsignarRutasEmpresaComponent } from './asignar-rutas-empresa/asignar-rutas-empresa.component';


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


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

