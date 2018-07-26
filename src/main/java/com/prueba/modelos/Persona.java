package com.prueba.modelos;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Persona {

	@Id
	ObjectId _id;
	private int cedula;
	private String nombres;
	private String apellidos;
	
	Persona(){}

	public String get_id() { 
		return _id.toHexString(); 
	}
	
	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
}
