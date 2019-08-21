package com.ucentral.edu.co.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ucentral.edu.co.entidades.Rol;

public class ManagerRol {
	
	private EntityManager em;
	private EntityManagerFactory emf;
	
	public ManagerRol() {
		emf= Persistence.createEntityManagerFactory("simple-service-webapp");
		em = emf.createEntityManager();
	
	}
	
	public List<Rol> listarTodosRoles(){
		return em.createNamedQuery("Rol.findAll", Rol.class).getResultList();
	}
	
	public void agregarRol(Rol rol) {
		em.persist(rol);
		em.flush();
	}
	
}
