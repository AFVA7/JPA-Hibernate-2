package com.latam.alura.tienda.modelo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Embedded
	private DatosPersonales datosPer;
	
	public Cliente() {}
	
	public Cliente(String nombre, String dni) {
		this.datosPer = new DatosPersonales(nombre, dni);
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return datosPer.getNombre();
	}

	public void setNombre(String nombre) {
		this.datosPer.setNombre(nombre);
	}

	public String getDni() {
		return datosPer.getNombre();
	}

	public void setDni(String dni) {
		this.datosPer.setDni(dni);
	}

}
