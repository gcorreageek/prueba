package com.app.dto;

import java.io.Serializable;

public class Solicitante implements Serializable  { 
	 
	private static final long serialVersionUID = 9126596152198816518L;
	private String nome;
	private String sobreNome;
	private String telefone;
	private String email;
	private String producto;
	private String pais;
	private String categoria;
	private String numeroOrden;
	private String numeroSerieProduto;
	private String reclamo;
	private String nombreEmpresa;//11
	
	private Integer idSolicitante;
	private String dataEhora;
	private String status;
	
	 
	@Override
	public String toString() {
		return "Solicitante [nome=" + nome + ", sobreNome=" + sobreNome + ", telefone=" + telefone + ", email=" + email
				+ ", producto=" + producto + ", pais=" + pais + ", categoria=" + categoria + ", numeroOrden="
				+ numeroOrden + ", numeroSerieProduto=" + numeroSerieProduto + ", reclamo=" + reclamo
				+ ", nombreEmpresa=" + nombreEmpresa + ", idSolicitante=" + idSolicitante + ", dataEhora=" + dataEhora
				+ ", status=" + status + "]";
	}
	public Solicitante() { 
	}
	public Solicitante(String nome, String sobreNome, String telefone, String email, String producto, String pais,
			String categoria, String numeroOrden, String numeroSerieProduto, String reclamo, String nombreEmpresa,
			Integer idSolicitante, String dataEhora, String status) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.telefone = telefone;
		this.email = email;
		this.producto = producto;
		this.pais = pais;
		this.categoria = categoria;
		this.numeroOrden = numeroOrden;
		this.numeroSerieProduto = numeroSerieProduto;
		this.reclamo = reclamo;
		this.nombreEmpresa = nombreEmpresa;
		this.idSolicitante = idSolicitante;
		this.dataEhora = dataEhora;
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(String numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public String getNumeroSerieProduto() {
		return numeroSerieProduto;
	}
	public void setNumeroSerieProduto(String numeroSerieProduto) {
		this.numeroSerieProduto = numeroSerieProduto;
	}
	public String getReclamo() {
		return reclamo;
	}
	public void setReclamo(String reclamo) {
		this.reclamo = reclamo;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public Integer getIdSolicitante() {
		return idSolicitante;
	}
	public void setIdSolicitante(Integer idSolicitante) {
		this.idSolicitante = idSolicitante;
	}
	public String getDataEhora() {
		return dataEhora;
	}
	public void setDataEhora(String dataEhora) {
		this.dataEhora = dataEhora;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
