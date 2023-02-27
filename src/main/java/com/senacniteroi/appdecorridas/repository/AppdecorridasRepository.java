package com.senacniteroi.appdecorridas.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	
	import com.senacniteroi.appdecorridas.model.Appdecorridas;
	
	@Repository
	public interface AppdecorridasRepository extends JpaRepository<Appdecorridas, Long> {
		
	}
