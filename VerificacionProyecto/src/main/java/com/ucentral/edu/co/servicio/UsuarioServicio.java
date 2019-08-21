package com.ucentral.edu.co.servicio;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ucentral.edu.co.dto.UsuarioDto;
import com.ucentral.edu.co.entidades.Usuario;
import com.ucentral.edu.co.manager.ManagerUsuario;

@Path("usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioServicio {

	
	@GET
	public List<Usuario> getAllusuario(){
		ManagerUsuario mu = new ManagerUsuario(); 
		return mu.getUsuario();
				
	}
	@Path("/{id}")
	@GET
	public List<Usuario> getidusuario(int id){
		ManagerUsuario mu = new ManagerUsuario(); 
		return mu.getidUsuario(id);
				
	}
	@POST
	public void agragarUsuario(UsuarioDto usuario) {
		ManagerUsuario mu = new ManagerUsuario();
		
		mu.insertarUsuario(usuario);
	}
	@Path("/{id}")
	@PUT
	public List<Usuario> updateidusuario(int id){
		ManagerUsuario mu = new ManagerUsuario(); 
		return mu.getUsuario();
				
	}
}
