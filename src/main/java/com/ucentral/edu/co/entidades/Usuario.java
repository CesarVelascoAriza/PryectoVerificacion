package com.ucentral.edu.co.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idusuario;

	private String apeusuario;

	private String contrasenausu;

	private String documentousu;

	@Temporal(TemporalType.DATE)
	private Date fechaadicionado;

	private String loginusu;

	private String nomusuario;

	private String usuarioadicionado;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="idrolusu")
	private Rol rol;

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

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}