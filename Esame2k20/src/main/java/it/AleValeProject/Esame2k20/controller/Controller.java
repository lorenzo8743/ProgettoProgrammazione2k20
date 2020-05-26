package it.AleValeProject.Esame2k20.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import it.AleValeProject.Esame2k20.webServices.DataService;
import it.AleValeProject.Esame2k20.webServices.DataServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private DataService serviziodati;
	
	@GetMapping("/GetInstructions")
	public ResponseEntity<Object> getinst(){
		return new ResponseEntity<>(serviziodati.VisulizzaIstruzioni(),HttpStatus.OK);
		
	}
	@GetMapping("/GetMetadata")
	public ResponseEntity<Object> getMetaD(){
		return new ResponseEntity<>(serviziodati.VisulizzaMetadata(),HttpStatus.OK);
		
	}
	
	@GetMapping("/GetData")
	public ResponseEntity<Object> getData(){
		return new ResponseEntity<>(serviziodati.VisalizzaData(),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/GetData/{filter}&{field}")
	public ResponseEntity<Object> getDataWithFilters(@PathVariable ("filter")String filtro, @PathVariable ("field")String campo){
		return new ResponseEntity<>(serviziodati.VisalizzaData(),HttpStatus.OK);
		
	}
	
	
	//@GetMapping("/GetFieldStats")
	
	
	@GetMapping("/GetStats")
	public ResponseEntity<Object> getStats(){
		return new ResponseEntity<>(serviziodati.VisulizzaStatistiche(),HttpStatus.OK);	
	}
	
	//@GetMapping("/GetStatsWithFilters")
	
	
	//@GetMapping("/GetFieldStatsWithFilter")
	
	
}
