package com.backend01.backend01.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name="ticket")
public class TicketModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTicket;
	
	private int nroTicket;
	
	@ManyToOne
	@JoinColumn(name="idCategoria") 
	private CategoriaModel categoria;
	
	private String tituloTicket;
	
	private String descTicket;
	
	@ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioModel usuario;
	
	@ManyToOne
    @JoinColumn(name = "idSoporte")
    private SoporteModel soporte;
	
	private int estadoTicket;
	
	private LocalDateTime fechaCreacionTicket;
	
	private LocalDateTime fechaAsignacionTicket;

	public TicketModel() {}

	public TicketModel(int nroTicket, CategoriaModel categoria, String tituloTicket, String descTicket,
			UsuarioModel usuario,SoporteModel soporte, int estadoTicket, LocalDateTime fechaCreacionTicket,
			LocalDateTime fechaAsignacionTicket) {
		super();
		this.nroTicket = nroTicket;
		this.categoria = categoria;
		this.tituloTicket = tituloTicket;
		this.descTicket = descTicket;
		this.usuario = usuario;
		this.soporte = soporte;
		this.estadoTicket = estadoTicket;
		this.fechaCreacionTicket = fechaCreacionTicket;
		this.fechaAsignacionTicket = fechaAsignacionTicket;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public int getNroTicket() {
		return nroTicket;
	}

	public void setNroTicket(int nroTicket) {
		this.nroTicket = nroTicket;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	public String getTituloTicket() {
		return tituloTicket;
	}

	public void setTituloTicket(String tituloTicket) {
		this.tituloTicket = tituloTicket;
	}

	public String getDescTicket() {
		return descTicket;
	}

	public void setDescTicket(String descTicket) {
		this.descTicket = descTicket;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public SoporteModel getSoporte() {
		return soporte;
	}

	public void setSoporte(SoporteModel soporte) {
		this.soporte = soporte;
	}
	
	public int getEstadoTicket() {
		return estadoTicket;
	}

	public void setEstadoTicket(int estadoTicket) {
		this.estadoTicket = estadoTicket;
	}

	public LocalDateTime getFechaCreacionTicket() {
		return fechaCreacionTicket;
	}

	public void setFechaCreacionTicket(LocalDateTime fechaCreacionTicket) {
		this.fechaCreacionTicket = fechaCreacionTicket;
	}

	public LocalDateTime getFechaAsignacionTicket() {
		return fechaAsignacionTicket;
	}

	public void setFechaAsignacionTicket(LocalDateTime fechaAsignacionTicket) {
		this.fechaAsignacionTicket = fechaAsignacionTicket;
	}
	
	
	
}
