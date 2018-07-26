package com.prueba.modelos;

import org.springframework.http.HttpStatus;

public class CustomActivoException extends RuntimeException{

    private HttpStatus estado;

    private CustomActivoException(){
        super();
    }

    public CustomActivoException(HttpStatus estado){
        this.estado = estado;
    }

    public CustomActivoException(HttpStatus estado, String mensaje){
        super(mensaje);
        this.estado = estado;
    }

    
    public HttpStatus getEstado (){ return this.estado; }

}

