package com.prueba.modelos;

import org.springframework.http.HttpStatus;

public class ApiError {

    private String mensaje;
    private HttpStatus estado;
    private int codigoEstado; 
    
    ApiError(){}
    
    public ApiError(String mensaje, HttpStatus estado){
        this.mensaje = mensaje;
        this.estado = estado;
        this.setCodigoEstado(estado.value());
    }

    public String getMensaje (){return  this.mensaje; }
    
    public HttpStatus getEstado (){ return this.estado; }

	public int getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
}
