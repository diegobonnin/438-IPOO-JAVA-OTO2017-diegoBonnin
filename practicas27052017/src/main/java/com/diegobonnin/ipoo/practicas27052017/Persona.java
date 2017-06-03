package com.diegobonnin.ipoo.practicas27052017;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Persona {
	
	private int id;
	private String nombre;
	private String nroDocumento;
	
	public Persona(){
		
	}
	
	public Persona(int id, String nombre, String nroDocumento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroDocumento = nroDocumento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", nroDocumento=" + nroDocumento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nroDocumento == null) ? 0 : nroDocumento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id != other.id)
			return false;
		if (nroDocumento == null) {
			if (other.nroDocumento != null)
				return false;
		} else if (!nroDocumento.equals(other.nroDocumento))
			return false;
		return true;
	}

	
	
	
}


