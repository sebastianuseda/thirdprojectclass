package co.edu.uniminuto.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniminuto.model.Dato;
import co.edu.uniminuto.service.DatoServiceI;

@CrossOrigin(origins = "*")
@RestController
public class DatoController {
	
	@Autowired
	DatoServiceI service;
	
	@GetMapping(value="datos", produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Dato>> getDatos(){
		
		//1.enviar por encabezado cat de registros
		List<Dato> datos = service.getAllDato();
		HttpHeaders headers = new HttpHeaders();
		headers.add("cant_datos",String.valueOf(datos.size()));
		return new ResponseEntity<List<Dato>>(datos,headers,HttpStatus.OK);
		
	}
	
	@GetMapping  (value="datos/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <Dato> getDatoId(@PathVariable("id") int id) {
		
		return new ResponseEntity<Dato>(service.searchDatoId(id), HttpStatus.OK);
		
	}
	
	@PostMapping( value="datos", consumes=MediaType.APPLICATION_JSON_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE
			
			)
	public ResponseEntity <Void> saveData(@RequestBody Dato dato) {
		
		if(service.addDato(dato)) {
			return new ResponseEntity <Void>(HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity <Void>(HttpStatus.CONFLICT);
		}
		
		
	}
	
	
	@PutMapping (value="datos", consumes=MediaType.APPLICATION_JSON_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE)
	public String updateData(@RequestBody Dato dato) {
		return String.valueOf(service.addDato(dato));
		
	}
	
	

	
}
