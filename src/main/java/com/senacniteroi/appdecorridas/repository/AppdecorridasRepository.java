package com.senacniteroi.appdecorridas.repository;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
	
	import com.senacniteroi.appdecorridas.model.Appdecorridas;
	
	@Repository
	public interface AppdecorridasRepository extends JpaRepository<Appdecorridas, Long> {
		public List<Appdecorridas> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	}
