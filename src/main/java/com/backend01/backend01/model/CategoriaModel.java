package com.backend01.backend01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")

public class CategoriaModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCategoria;

    private String nomCategoria;

	public CategoriaModel() {}

	public CategoriaModel(String nomCategoria) {
		super();
		this.nomCategoria = nomCategoria;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomCategoria() {
		return nomCategoria;
	}

	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
	}
    
    
}


