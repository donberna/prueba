package com.prueba.repositorios;



import org.springframework.data.mongodb.repository.MongoRepository;
import com.prueba.modelos.Activo;
import java.util.Date;
import java.util.List;


public interface ActivosRepository extends MongoRepository<Activo, String> {

	public Activo findBySerial(String serial);
	public Activo findByNumeroInternoInventario(int numeroInternoInventario);
	public List<Activo> findByNombre(String nombre);
	public List<Activo> findByFechaCompra(Date fechaCompra);
	public List<Activo> findByfechaBaja(Date fechaBaja);
	
    
}
