package com.senacniteroi.appdecorridas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senacniteroi.appdecorridas.model.Appdecorridas;
import com.senacniteroi.appdecorridas.repository.AppdecorridasRepository;

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

}
