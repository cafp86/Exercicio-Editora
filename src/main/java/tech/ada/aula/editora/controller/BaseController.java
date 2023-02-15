package tech.ada.aula.editora.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.persistence.EntityNotFoundException;
import tech.ada.aula.editora.model.dto.EditoraDTO;
import tech.ada.aula.editora.service.BaseService;

public abstract class BaseController<T,S extends BaseService>{
	@Autowired
	private S service;
	
	private static final Logger log = LoggerFactory.getLogger(BaseController.class);
	
	@GetMapping
	public ResponseEntity<List<T>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<T> buscarUm(@PathVariable("id") Long id){
		try {
			return ResponseEntity.ok(service.buscarUm(id));
			
		}catch(EntityNotFoundException ex) {
        	
        	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch(Exception ex) {
        	
            log.error(ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
	}
	
	@PostMapping
	public ResponseEntity<T> criar(@RequestBody T entidade){
        try {

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(service.criar(entidade));

        }catch(Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
	}
}
