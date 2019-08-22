import { Component, OnInit } from '@angular/core';
import { UsuarioServiceService } from '../services/usuario-service.service';
import { Usuario } from '../models/usuario';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

  public usuarios: Usuario[] = null;

  constructor(private usuarioService: UsuarioServiceService) { }

  ngOnInit() {
    this.getUsers();
  }

  getUsers(){
    this.usuarioService.getAll().subscribe((response)=>{
      this.usuarios = response;
    });
  }

}
