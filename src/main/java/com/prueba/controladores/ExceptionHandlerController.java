package com.prueba.controladores;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.prueba.modelos.ApiError;
import com.prueba.modelos.CustomActivoException;

@RestControllerAdvice
public class ExceptionHandlerController {


    @ExceptionHandler()
    public ResponseEntity handleCustomActivoException(CustomActivoException cae) {
        ApiError ae = new ApiError(cae.getMessage());
        return new ResponseEntity<ApiError>(ae, cae.getEstado());
    }
}
