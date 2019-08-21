package com.ucentral.edu.co.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAHelper {
	
	private static final EntityManagerFactory emf =buildEntityManagerFactory() ;
	private static EntityManagerFactory buildEntityManagerFactory() {
		try {
			return Persistence.createEntityManagerFactory("simple-service-webapp");
		} catch (Exception e) {
			throw new RuntimeException("Erroe al crear la factoria de de jpa ");
		}
	}
	public static  EntityManagerFactory getJPAFactory() { return emf;}

}
