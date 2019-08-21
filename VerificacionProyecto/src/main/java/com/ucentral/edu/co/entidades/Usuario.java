package com.ucentral.edu.co.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQueries({ 
	@NamedQuery(name = "getIdUsuario", query = "SELECT u FROM Usuario u WHERE u.documentousu = :documentousu"), 
	@NamedQuery(name = "getByUsuarioandPass", query = "SELECT u FROM Usuario u WHERE u.contrasenausu = :contrasenausu  and u.contrasenausu = :contrasenausu1"),
	@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u") 
})
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idusuario;

	private String apeusuario;

	private String contrasenausu;

	private String documentousu;

	@Temporal(TemporalType.DATE)
	private Date fechaadicionado;

	private String loginusu;

	private String nomusuario;

	private String usuarioadicionado;

	public Usuario() {
	}

	public long getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(long idusuario) {
		this.idusuario = idusuario;
	}

	public String getApeusuario() {
		return this.apeusuario;
	}

	public void setApeusuario(String apeusuario) {
		this.apeusuario = apeusuario;
	}

	public String getContrasenausu() {
		return this.contrasenausu;
	}

	public void setContrasenausu(String contrasenausu) {
		this.contrasenausu = contrasenausu;
	}

	public String getDocumentousu() {
		return this.documentousu;
	}

	public void setDocumentousu(String documentousu) {
		this.documentousu = documentousu;
	}

	public Date getFechaadicionado() {
		return this.fechaadicionado;
	}

	public void setFechaadicionado(Date fechaadicionado) {
		this.fechaadicionado = fechaadicionado;
	}

	public String getLoginusu() {
		return this.loginusu;
	}

	public void setLoginusu(String loginusu) {
		this.loginusu = loginusu;
	}

	public String getNomusuario() {
		return this.nomusuario;
	}

	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}

	public String getUsuarioadicionado() {
		return this.usuarioadicionado;
	}

	public void setUsuarioadicionado(String usuarioadicionado) {
		this.usuarioadicionado = usuarioadicionado;
	}

}