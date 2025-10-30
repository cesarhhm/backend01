package com.backend01.backend01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")

public class UsuarioModel {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long idUsuario;

	    private String nomUsuario;

	    private String correoUsuario;

	    private String areaUsuario;

		public UsuarioModel() {}

		public UsuarioModel(String nomUsuario, String correoUsuario, String areaUsuario) {
			super();
			this.nomUsuario = nomUsuario;
			this.correoUsuario = correoUsuario;
			this.areaUsuario = areaUsuario;
		}

		public Long getIdUsuario() {
			return idUsuario;
		}

		public void setIdUsuario(Long idUsuario) {
			this.idUsuario = idUsuario;
		}

		public String getNomUsuario() {
			return nomUsuario;
		}

		public void setNomUsuario(String nomUsuario) {
			this.nomUsuario = nomUsuario;
		}

		public String getCorreoUsuario() {
			return correoUsuario;
		}

		public void setCorreoUsuario(String correoUsuario) {
			this.correoUsuario = correoUsuario;
		}

		public String getAreaUsuario() {
			return areaUsuario;
		}

		public void setAreaUsuario(String areaUsuario) {
			this.areaUsuario = areaUsuario;
		}

	}
