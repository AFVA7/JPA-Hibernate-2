package com.latam.alura.tienda.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class CategoriaId implements Serializable{
	
	private String nombre;
	private String passwd;
	
	public CategoriaId() {
		// TODO Auto-generated constructor stub
	}

	public CategoriaId(String nombre, String passwd) {
		super();
		this.nombre = nombre;
		this.passwd = passwd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, passwd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaId other = (CategoriaId) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(passwd, other.passwd);
	}
	
	
	
	

}
