package com.app.main;

import javax.xml.ws.Endpoint;

import com.app.servicioweb.SolicitanteServicioWeb;

public class Principal {
	public static void main(String[] args) {
		Endpoint endPoint = Endpoint.publish("http://localhost:8080/llamada", new SolicitanteServicioWeb());
		System.out.println(endPoint.isPublished());
	}
}
