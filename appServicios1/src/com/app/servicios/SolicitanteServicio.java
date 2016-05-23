package com.app.servicios;

import java.io.IOException;
import java.util.List;

import com.app.dto.Solicitante;

public interface SolicitanteServicio {
	public Solicitante registrarSolicitante(Solicitante solicitante) throws IOException, Exception;
//	public Solicitante getLastSolicitante() throws IOException, Exception;
	public List<Solicitante> getSolicitantes() throws IOException, Exception;
	
}
