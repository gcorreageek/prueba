package com.app.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.app.dto.Solicitante;

public class UtilFile {	 
	private String rutaArchivo;
	private Solicitante solicitante;  
	public static void main(String[] args) {
		Solicitante so = new Solicitante();
//		so.setStatus(Status.ABERTO);
		System.out.println("==>"+so.getStatus());
	}
	public List<Solicitante> leerArquivo( ) throws IOException,Exception   {
		List<Solicitante> lSolicitante = null;
		File file = verificarRuta();  
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		try {
			fileReader = new FileReader(file);
			if(fileReader.ready()){
				lSolicitante = new ArrayList<Solicitante>();
			}
			bufferReader = new BufferedReader(fileReader);
			String linea = "";
			String[] arrayDatos = null;
			Solicitante solicitante = null;
			while((linea =bufferReader.readLine())!=null){
				arrayDatos= linea.split(";");
				solicitante = new Solicitante();
				solicitante.setIdSolicitante(Integer.parseInt(arrayDatos[0].toString()));
				solicitante.setDataEhora(arrayDatos[1].toString());
				solicitante.setStatus(arrayDatos[2].toString());
				
				solicitante.setNome(arrayDatos[3].toString());
				solicitante.setSobreNome(arrayDatos[4].toString());
				solicitante.setTelefone(arrayDatos[5].toString());
				solicitante.setEmail(arrayDatos[6].toString());
				solicitante.setProducto(arrayDatos[7].toString());
				solicitante.setPais(arrayDatos[8].toString());
				solicitante.setCategoria(arrayDatos[9].toString());
				solicitante.setNumeroOrden(arrayDatos[10].toString());
				solicitante.setNumeroSerieProduto(arrayDatos[11].toString());
				solicitante.setReclamo(arrayDatos[12].toString());
				solicitante.setNombreEmpresa(arrayDatos[13].toString());
				lSolicitante.add(solicitante);
			}
		} catch (IOException e) {
			Logger.getLogger(getClass().getName()).log( Level.SEVERE, "Ocurrio un error al leer",e);
			throw e;
		}catch (Exception e) {
			Logger.getLogger(getClass().getName()).log( Level.SEVERE, "Ocurrio un error",e);
			throw e;
		}finally {
			fileReader.close();
			bufferReader.close();
		}
		return lSolicitante;
	}
	public void escribirArquivo() throws IOException, Exception {
		File file = verificarRuta(); 
		FileWriter fileWriter = null;
		BufferedWriter bufferWriter = null;
		try {
			fileWriter = new FileWriter(file,true);
			bufferWriter = new BufferedWriter(fileWriter);
			
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(solicitante.getIdSolicitante());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getDataEhora());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getStatus());
			stringBuilder.append(";"); 
			
			stringBuilder.append(solicitante.getNome());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getSobreNome());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getTelefone());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getEmail());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getProducto());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getPais());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getCategoria());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getNumeroOrden());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getNumeroSerieProduto());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getReclamo());
			stringBuilder.append(";");
			stringBuilder.append(solicitante.getNombreEmpresa());
			
			bufferWriter.write(stringBuilder.toString());
			bufferWriter.newLine();
			bufferWriter.flush();
		} catch (IOException e) {
			Logger.getLogger(getClass().getName()).log( Level.SEVERE, "Ocurrio un error al leer",e);
			throw e;
		}catch (Exception e) {
			Logger.getLogger(getClass().getName()).log( Level.SEVERE, "Ocurrio un error",e);
			throw e;
		}finally {
			fileWriter.close();
			bufferWriter.close();
		}  
	}
	private File verificarRuta() throws IOException {
		File file = new File(rutaArchivo);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) { 
				Logger.getLogger(getClass().getName()).log( Level.SEVERE, "No se pudo leer el archivo, cambiar de ruta",e);
				throw e;
			}
		}
		return file;
	} 
	public boolean borrar(String rutaArchivo) {
		File file = new File(rutaArchivo); 
		return file.delete();
	}
	public boolean existeArquivo(String rutaArchivo) {
		File file = new File(rutaArchivo); 
		return file.exists();
	}

	
	
	
	
	
	public String getRutaArchivo() {
		return rutaArchivo;
	}
	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
	
	
}
