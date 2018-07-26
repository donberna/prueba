package com.prueba.modelos;

public class ApiError {

    private String mensaje;

    ApiError(){}
    
    public ApiError(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje (){return  this.mensaje; }
}
