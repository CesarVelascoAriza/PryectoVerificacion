package com.ucentral.edu.co.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ucentral.edu.co.dto.UsuarioDto;
import com.ucentral.edu.co.entidades.Usuario;

public class ManagerUsuario {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	
	public ManagerUsuario() {
		this.emf= JPAHelper.getJPAFactory();
		this.em = emf.createEntityManager();
		
	}
	
	
	public List<Usuario> getUsuario(){
		return em.createNamedQuery("Usuario.findAll", Usuario.class).getResultList();
	}
	public List<Usuario> getidUsuario(int id){
		return em.createNamedQuery("Usuario.findAll", Usuario.class).setParameter("id", id).getResultList();
	}
	public void insertarUsuario(UsuarioDto usuario) {
		EntityManagerFactory fsession= JPAHelper.getJPAFactory();
		EntityManager manager =fsession.createEntityManager();
		EntityTransaction tx = null;
		tx = manager.getTransaction();
		try {
			manager.persist(usuario);
			manager.flush();
			tx.commit();
			manager.close();
		} catch (Exception e) {
			e.getMessage();
			manager.close();
			tx.rollback();
		}
		
	}
	public void updateUsuario(int u) {
		EntityTransaction tx = this.em.getTransaction();
		try {
			tx = this.em.getTransaction();
			tx.begin();
			this.em.merge(u);
			this.em.flush();
			tx.commit();
			this.em.close();
		} catch (Exception e) {
			e.getMessage();
			this.em.close();
			tx.rollback();
		}
		
	}
}
