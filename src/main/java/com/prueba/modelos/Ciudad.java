package com.prueba.modelos;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "ciudad")
public class Ciudad {

	@Id
	private String _id;
	private int codigo;
	private String nombre;
	
	
	Ciudad(){}
	
	
	public String get_id() { 
		return _id; 
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
