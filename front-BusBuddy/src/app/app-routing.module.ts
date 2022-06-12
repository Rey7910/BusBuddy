import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeUsuarioComponent } from './home-usuario/home-usuario.component';


const routes: Routes = [
  {
    path: 'login',
    component: LoginComponent,
},
{
  path: '',
  redirectTo: 'login',
  pathMatch: 'full',
},
{
    path: 'home-usuario',
    component: HomeUsuarioComponent,
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

