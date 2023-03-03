package com.senacniteroi.appdecorridas.controller;

import java.util.List;
import java.util.Optional;

//import com.senacniteroi.appdecorridas.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.senacniteroi.appdecorridas.model.Appdecorridas;
import com.senacniteroi.appdecorridas.repository.AppdecorridasRepository;

import jakarta.validation.Valid;

@RestController
	@RequestMapping("/appdecorridas")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public class AppdecorridasController { 
		
		@Autowired
		private AppdecorridasRepository appdecorridasRepository;
		
		@GetMapping
		public ResponseEntity<List<Appdecorridas>> getAll() {
			return ResponseEntity.ok(appdecorridasRepository.findAll());
		}

		@GetMapping("/{id}")
		public ResponseEntity<Appdecorridas> getById(@PathVariable Long id){
			return appdecorridasRepository.findById(id)
					.map(resposta -> ResponseEntity.ok(resposta))
					.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		
		}
		
		@GetMapping("/nome/{nome}")
		public ResponseEntity<List<Appdecorridas>> getByNome(@PathVariable String nome){
			return ResponseEntity.ok(appdecorridasRepository.findAllByNomeContainingIgnoreCase(nome));
		}
		
		@PostMapping
		public ResponseEntity<Appdecorridas> post(@Valid @RequestBody Appdecorridas appdecorridas){
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(appdecorridasRepository.save(appdecorridas));
		}
		@PutMapping("/{id}")
		public ResponseEntity<Appdecorridas> put(@Valid @RequestBody Appdecorridas appdecorridas){
			return appdecorridasRepository.findById(appdecorridas.getId())
					.map(resposta -> ResponseEntity.status(HttpStatus.OK)
							.body(appdecorridasRepository.save(appdecorridas)))
					.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		}
		
		@ResponseStatus(HttpStatus.NO_CONTENT)
		@DeleteMapping("/{id}")
		public void delete(@PathVariable Long id) {
			Optional<Appdecorridas > appdecorridas = appdecorridasRepository.findById(id);
			
			if(appdecorridas.isEmpty())
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			
			appdecorridasRepository.deleteById(id);
		}
}