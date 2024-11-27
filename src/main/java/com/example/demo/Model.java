package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
	@Data
	@Table(name = "bibliotech")


	public class Model {
		
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	 
		@Column(nullable = false )
		private String Autor;
		
		@Column(nullable = false )
		private String titulo;
		
		@Column(nullable = false )
		private String nome;
		
		@Column(nullable = false )
		private int quantidade;
		
//		@Column(nullable = false )
//		private long bibliotech_id;
		
		@Column(name = "imag_url")
	    private String imagURL; // URL da imagem
	}

