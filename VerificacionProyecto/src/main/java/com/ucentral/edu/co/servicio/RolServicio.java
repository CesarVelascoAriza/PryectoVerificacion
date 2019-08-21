package com.ucentral.edu.co.servicio;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ucentral.edu.co.entidades.Rol;
import com.ucentral.edu.co.manager.ManagerRol;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("rol")
public class RolServicio {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	public ManagerRol managerRol;
	
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Rol> getallRol() {
    	managerRol = new ManagerRol();
    	return  managerRol.listarTodosRoles();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void newRol(Rol rol) {
    	
    	managerRol = new ManagerRol();
    	managerRol.agregarRol(rol);
    }
}
