package com.backend01.backend01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "soporte")

public class SoporteModel {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int idSoporte;

	    private String nomSoporte;

	    private String correoSoporte;

		public SoporteModel() {
		}

		public SoporteModel( String nomSoporte, String correoSoporte) {
			super();
			this.nomSoporte = nomSoporte;
			this.correoSoporte = correoSoporte;
		}

		public int getIdSoporte() {
			return idSoporte;
		}

		public void setIdSoporte(int idSoporte) {
			this.idSoporte = idSoporte;
		}

		public String getNomSoporte() {
			return nomSoporte;
		}

		public void setNomSoporte(String nomSoporte) {
			this.nomSoporte = nomSoporte;
		}

		public String getCorreoSoporte() {
			return correoSoporte;
		}

		public void setCorreoSoporte(String correoSoporte) {
			this.correoSoporte = correoSoporte;
		}
	    
	    

}
