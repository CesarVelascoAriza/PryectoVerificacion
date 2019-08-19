import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { RolComponent } from './rol/rol.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent},
  { path: 'Usuario', component: UsuarioComponent},
  { path: 'rol', component: RolComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
