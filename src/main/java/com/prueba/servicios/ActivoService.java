package com.prueba.servicios;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.prueba.modelos.Activo;
import com.prueba.modelos.CustomActivoException;
import com.prueba.repositorios.ActivosRepository;


@Service("activoService")
public class ActivoService {

	@Autowired
    private ActivosRepository activoRepository;
	
	public Activo consultarPorNumeroInternoInventario(int numeroInternoInventario) {
		Activo activo = activoRepository.findByNumeroInternoInventario(numeroInternoInventario);
        
		if(activo == null) {
        	throw new CustomActivoException(HttpStatus.NOT_FOUND, "No se encuentra el registro");
        }
	
		return activo;
	}
	
	public List<Activo> listar() {
		List<Activo> listaActivos = activoRepository.findAll();
		System.out.println(listaActivos);
		return listaActivos;
	}
	
	public void guardar(Activo activo) {
		
		Activo activoBD = activoRepository.findByNumeroInternoInventario(activo.getNumeroInternoInventario());
		
		if(activoBD != null) {
			throw new CustomActivoException(HttpStatus.CONFLICT, "Ya existe un activo creado con este numero de inventario");
		}
		
		if(activo.esFechaBajaMayorAFechaCompra()) {
			throw new CustomActivoException(HttpStatus.BAD_REQUEST, "fecha de baja mayor a fecha de compra");
		}
		
		activoRepository.insert(activo);
	}
	
	public void actualizar(Activo activo) {
		
		Activo activoBD = activoRepository.findByNumeroInternoInventario(activo.getNumeroInternoInventario());
		if(activoBD == null) {
        	throw new CustomActivoException(HttpStatus.NOT_FOUND, "No existe el activo, no se puede actualizar");
        }
		
		if(activo.esFechaBajaMayorAFechaCompra()) {
			throw new CustomActivoException(HttpStatus.BAD_REQUEST, "fecha de baja mayor a fecha de compra");
		}
		
		activoBD.setSerial(activo.getSerial());
		activoBD.setFechaBaja(activo.getFechaBaja());
		
		activoRepository.save(activoBD);
	}	
}
