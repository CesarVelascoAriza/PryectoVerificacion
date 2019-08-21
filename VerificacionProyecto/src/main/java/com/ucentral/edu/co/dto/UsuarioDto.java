package com.ucentral.edu.co.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the usuario database table.
 * 
 */
public class UsuarioDto {
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

	public UsuarioDto() {
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