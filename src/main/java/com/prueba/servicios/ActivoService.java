package com.prueba.servicios;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prueba.modelos.Activo;
import com.prueba.repositorios.ActivosRepository;


@Service("activoService")
public class ActivoService {

	@Autowired
    private ActivosRepository activoRepository;
	
	public Activo consultarPorSerial(String serial) {
		return null;
	}
	
	public List listar() {
		return null;
	}
	
	public void guardar(Activo activo) {
		
	}
	
	public void actualizar(Activo activo) {
		
	}
	
	
}
