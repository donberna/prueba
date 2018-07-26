package com.prueba.modelos;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


public class Area {
	
	@Id
	ObjectId _id;
	private int codigo;
	private String nombre;
	
	Area(){}

	public String get_id() { 
		return _id.toHexString(); 
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
