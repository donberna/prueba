package com.prueba.controladores;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.modelos.Activo;
import com.prueba.modelos.CustomActivoException;
import com.prueba.servicios.ActivoService;


@RestController
@RequestMapping("api/activo/")
public class ApiRestController {

	@Autowired
	private ActivoService activoService;
	
	@RequestMapping(value = "/consultar/{serial}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarPorSerial(@PathVariable("serial") String serial) throws CustomActivoException {

        Activo activo = activoService.consultarPorSerial(serial);
        return new ResponseEntity<Activo>(activo, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
    public ResponseEntity<?> listar() {

        List<Activo> listaActivos = activoService.listar();
        return new ResponseEntity<List<Activo>>(listaActivos, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ResponseEntity<?> guardarActivo(@Valid @RequestBody Activo activo) {

        activoService.guardar(activo);
        return new ResponseEntity<Activo>(activo, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    public ResponseEntity<?> actualizarActivo(@Valid @RequestBody Activo activo) {

        activoService.actualizar(activo);
        return new ResponseEntity<Activo>(activo, HttpStatus.OK);
    }
	
	
	
	
}
