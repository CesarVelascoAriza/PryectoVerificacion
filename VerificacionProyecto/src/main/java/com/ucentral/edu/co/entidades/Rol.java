package com.ucentral.edu.co.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@NamedQueries({ 
	@NamedQuery(name = "getRol", query = "SELECT r FROM Rol r WHERE r.idrol = :idrol"), 
	@NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r") 
})
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idrol;

	private String descripcionrol;

	@Temporal(TemporalType.DATE)
	private Date fechaadicionado;

	private String usuarioadicionado;

	public Rol() {
	}

	public long getIdrol() {
		return this.idrol;
	}

	public void setIdrol(long idrol) {
		this.idrol = idrol;
	}

	public String getDescripcionrol() {
		return this.descripcionrol;
	}

	public void setDescripcionrol(String descripcionrol) {
		this.descripcionrol = descripcionrol;
	}

	public Date getFechaadicionado() {
		return this.fechaadicionado;
	}

	public void setFechaadicionado(Date fechaadicionado) {
		this.fechaadicionado = fechaadicionado;
	}

	public String getUsuarioadicionado() {
		return this.usuarioadicionado;
	}

	public void setUsuarioadicionado(String usuarioadicionado) {
		this.usuarioadicionado = usuarioadicionado;
	}

}