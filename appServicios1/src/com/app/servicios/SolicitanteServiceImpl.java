package com.app.servicios;

import java.io.IOException;
import java.util.List;

import com.app.dto.Solicitante;
import com.app.util.Constantes;
import com.app.util.UtilFile;
import com.app.util.UtilesDate;

public class SolicitanteServiceImpl implements SolicitanteServicio {
	UtilFile utilFile = null;
	UtilesDate utilesDate = null;
	public SolicitanteServiceImpl() { 
		utilFile = new UtilFile();
		utilFile.setRutaArchivo(Constantes.RUTA_ARCHIVO);
		utilesDate = UtilesDate.getInstance();
	}
	
	
	@Override
	public Solicitante registrarSolicitante(Solicitante solicitante) throws IOException, Exception {
		solicitante.setIdSolicitante(this.getLastSolicitante().getIdSolicitante()+1);
		solicitante.setDataEhora(utilesDate.fechaHoraActual());
		solicitante.setStatus(solicitante.getStatus());
		utilFile.setSolicitante(solicitante);
		utilFile.escribirArquivo();
		return solicitante;
	}
 
	private Solicitante getLastSolicitante() throws IOException, Exception {
		return this.getSolicitantes()==null?
				new Solicitante("", "", "", "", "", "", "", "", "", "", "", 0, "", ""):
				this.getSolicitantes().get(this.getSolicitantes().size()-1);
	}

	@Override
	public List<Solicitante> getSolicitantes() throws IOException, Exception {
		return utilFile.leerArquivo();
	}

}
