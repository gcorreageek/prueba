package com.app.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.After;
import   org.junit.Assert ;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.app.dto.Solicitante;
 
 
public class UtilFileTest {
 
	private UtilFile utilFile;
	private Solicitante solicitante;
	
	@Before
	public void setUp(){
//		System.out.println("INICIO!"); 
		utilFile = new UtilFile();
		solicitante = new Solicitante();
		solicitante.setIdSolicitante(1);
		solicitante.setDataEhora(new Date().toString());
		solicitante.setStatus("1");  
		solicitante.setNome("Gustavo");
		solicitante.setSobreNome("Correa");
		solicitante.setTelefone("991478008");
		solicitante.setEmail("fff@hotmail.com");
		solicitante.setProducto("CASA");
		solicitante.setPais("PERU");
		solicitante.setCategoria("CATEGORIA");
		solicitante.setNumeroOrden("11101");
		solicitante.setNumeroSerieProduto("PROD999992001");
		solicitante.setReclamo("¿RECLAMO?");
		solicitante.setNombreEmpresa("ZAAVEDRA SAC");
		
	}
	
	@Ignore
	@Test(expected= IOException.class)
	public void leerRutaInvalida() throws IOException   { 
		Assert.assertNotNull(utilFile);
		try {
			utilFile.setRutaArchivo(Constantes.RUTA_ARCHIVO_ERROR);
			utilFile.leerArquivo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Ignore
	@Test
	public void escribirLeerBorrarArchivoTest() throws IOException, Exception{
		utilFile.setRutaArchivo(Constantes.RUTA_ARCHIVO_TEST);
		utilFile.setSolicitante(solicitante);
		utilFile.escribirArquivo();
		List<Solicitante> lSolicitante1 =  Arrays.asList(solicitante );
//		List<Solicitante> lSolicitante1 =  Arrays.asList(new Solicitante("Gustavo", "Correa", "991478008", "fff@hotmail.com", 
//				"CASA", "PERU", "CATEGORIA", "11101", "PROD999992001", "¿RECLAMO?", "ZAAVEDRA SAC", 1, new Date().toString(), "1") );
		List<Solicitante> l = null;
		try {
			l = utilFile.leerArquivo();
			Solicitante[] s1 = l.toArray(new Solicitante[l.size()]);
			Solicitante[] s2 = lSolicitante1.toArray(new Solicitante[1]);
			System.out.println( Arrays.toString(s1));
			System.out.println( Arrays.toString(s2));
			Assert.assertTrue(Arrays.equals(s1, s2));
			Assert.assertEquals(utilFile.borrar(Constantes.RUTA_ARCHIVO_TEST), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
//	@Test
//	public void borrarArchivoTest() {
//		System.out.println("[borrarArchivoTest]");
//		boolean existeArchivo = utilFile.existeArquivo(Constantes.RUTA_ARCHIVO_TEST);
//		Assert.assertEquals(existeArchivo, true);
//		Assert.assertEquals(utilFile.borrar(Constantes.RUTA_ARCHIVO_TEST), true);
//	} 
//	@Test 
//	public void escribir()     { 
//		System.out.println("[escribir]");
//		Assert.assertNotNull(utilFile);
//		utilFile.escribirArquivo(Constantes.RUTA_ARCHIVO_TEST,solicitante);
//	}
//	@Test 
//	public void leerRuta()    { 
//		System.out.println("[leerRuta]");
//		Assert.assertNotNull(utilFile);
//		Assert.assertNotNull(solicitante);
//		 List<Solicitante> lSolicitante1 =  Arrays.asList(new Solicitante("Gustavo", "Correa", "991478008", "fff@hotmail.com", 
//				 "CASA", "PERU", "CATEGORIA", "11101", "PROD999992001", "¿RECLAMO?", "ZAAVEDRA SAC", 1, new Date().toString(), "1") );
//		List<Solicitante> l = null;
//		try {
//			l = utilFile.leerArquivo(Constantes.RUTA_ARCHIVO_TEST);
//			System.out.println(Arrays.toString(l.toArray(new Solicitante[l.size()])));
//			System.out.println(lSolicitante1.toArray(new Solicitante[1]));
//			Assert.assertEquals(utilFile.leerArquivo(Constantes.RUTA_ARCHIVO_TEST), lSolicitante1);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//	}
	@After
	public void setDown(){
		solicitante=null;
//		System.out.println("FIN!"); 
	}

}











