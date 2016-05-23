package com.app.servicioweb;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.app.dto.Solicitante;
import com.app.servicios.SolicitanteServiceImpl;
import com.app.servicios.SolicitanteServicio;

@WebService
//@SOAPBinding()
public class SolicitanteServicioWeb {
	
	private SolicitanteServicio solicitanteServicio = new SolicitanteServiceImpl(); 
	public SolicitanteServicioWeb() {
	}
	
	@WebMethod
	public Solicitante registrarSolicitante(Solicitante solicitante){
		try {
			solicitante = solicitanteServicio.registrarSolicitante(solicitante);
			return solicitante; 
		} catch (IOException e) {
			Logger.getLogger(getClass().getName()).log( Level.SEVERE, "Ocurrio un error",e);
		} catch (Exception e) {
			Logger.getLogger(getClass().getName()).log( Level.SEVERE, "Ocurrio un error",e);
		}
		return null;
	}
	@WebMethod
	public List<Solicitante> listarSolicitante(){
		try {
			return solicitanteServicio.getSolicitantes();
		} catch (IOException e) {
			Logger.getLogger(getClass().getName()).log( Level.SEVERE, "Ocurrio un error",e);
		} catch (Exception e) {
			Logger.getLogger(getClass().getName()).log( Level.SEVERE, "Ocurrio un error",e);
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
//	public void ejecutar(){
//		try {
//			for (int i = 0; i < 60; i++) {
//				Solicitante sol = solicitanteServicio.registrarSolicitante(new Solicitante("Gustavo", "Correa", "991478008", "fff@hotmail.com", 
//						"CASA", "PERU", "CATEGORIA", "11101", "PROD999992001", "¿RECLAMO?", "ZAAVEDRA SAC", -3, new Date().toString(), "1"));
//				System.out.println("SOL==>"+sol.getIdSolicitante());
//			}
//			
//			for (Solicitante solicitante : solicitanteServicio.getSolicitantes()) {
//				System.out.println(solicitante.getIdSolicitante());
//			} 
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		new SolicitanteServicioWeb().ejecutar();
//	}
}
