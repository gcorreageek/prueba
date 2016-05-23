package com.app.servicioweb;

import com.app.servicios.SolicitanteServiceImpl;
import com.app.servicios.SolicitanteServicio;

public class SolicitanteServicioWeb {
	
	SolicitanteServicio solicitanteServicio = null;
	private SolicitanteServicioWeb() {
		solicitanteServicio = new SolicitanteServiceImpl(); 
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
