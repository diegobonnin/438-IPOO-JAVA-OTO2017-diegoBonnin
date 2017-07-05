package com.diegobonnin.ipoo.baseDeDatos.hibernate;

import java.util.Date;

public class Persona {
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", lugarDeNacimiento=" + lugarDeNacimiento + ", fechaDeNacimiento="
				+ fechaDeNacimiento + ", nacionalidad=" + nacionalidad + ", tipoDoc=" + tipoDoc + ", nroDoc=" + nroDoc
				+ ", direccionParticular=" + direccionParticular + ", telefono=" + telefono + ", nombre=" + nombre
				+ "]";
	}

	private Long id;
	private String lugarDeNacimiento;
	private Date fechaDeNacimiento;
	private String nacionalidad;
	private String tipoDoc;
	private String nroDoc;
	private String direccionParticular;
	private String telefono;
	private String nombre;
	
	public Persona(){
		
	}

	public Persona(String nombre, Date fechaDeNacimiento) {
		super();
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getDireccionParticular() {
		return direccionParticular;
	}

	public void setDireccionParticular(String direccionParticular) {
		this.direccionParticular = direccionParticular;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
