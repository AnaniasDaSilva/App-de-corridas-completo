package com.senacniteroi.appdecorridas.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_appdecorridas")
public class Appdecorridas {


	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do passageiro é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 10 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo endereço é Obrigatório!")
	@Size(min = 30, max = 100, message = "O atributo endereço deve conter no mínimo 30 e no máximo 100 caracteres")
	private String endereço;
	
	@NotBlank(message = "O atributo local de partida  é Obrigatório!")
	@Size(min = 30, max = 100, message = "O atributo local de partida deve conter no mínimo 30 e no máximo 100 caracteres")
	private String localdepartida;
	
	@NotBlank(message = "O atributo local de chegada é Obrigatório!")
	@Size(min = 30, max = 100, message = "O atributo local de chegada  deve conter no mínimo 30 e no máximo 100 caracteres")
	private String localdechegada;
	
	@UpdateTimestamp
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getLocaldepartida() {
		return localdepartida;
	}

	public void setLocaldepartida(String localdepartida) {
		this.localdepartida = localdepartida;
	}

	public String getLocaldechegada() {
		return localdechegada;
	}

	public void setLocaldechegada(String localdechegada) {
		this.localdechegada = localdechegada;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}


