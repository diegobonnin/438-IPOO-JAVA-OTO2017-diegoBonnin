package com.diegobonnin.ipoo.practicas.archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.diegobonnin.ipoo.practicas27052017.Persona;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ArchivosClase {
	
	public void copiar(String origen, String destino){
		
		// Clase para leer un stream de entrada, en este
		// caso un archivo
		// Input: significa entrada
		FileInputStream entrada=null;
		// Clase para escribir en un stream de salida, en este
		// caso un archivo		
		// Output: significa salida
		FileOutputStream salida=null;
		
		try{
			
			entrada=new FileInputStream(origen);
			salida=new FileOutputStream(destino);
			int c;
			while((c=entrada.read())!=-1) salida.write(c);
			
			
		}catch(IOException ioe){
			System.out.println("Ocurrio un error al acceder a uno de los archivos: " + ioe.getMessage());
			
		// SIEMPRE CERRAR LOS ARCHIVOS UTILIZADOS
		// EN UN FINALLY
		}finally{
			if(entrada!=null){
				try {
					entrada.close();
				} catch (IOException _ioe) {
					System.out.println("No se pudo cerrar el archivo de origen: " + _ioe.getMessage());
				}
			}
			if(salida!=null){
				try {
					salida.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
		
	public String leerArchivo(String archivo){
			
		FileReader entrada=null;
		char[] buffer=new char[1024];
			
		StringBuilder sb=new StringBuilder();
		
		try{
			entrada=new FileReader(archivo);
			while(entrada.read(buffer) > 0){
				sb.append(buffer);
			}
		}catch(IOException ioe){
			System.out.println("Ocurrio un error al acceder a uno de los archivos: " + ioe.getMessage());
		// SIEMPRE CERRAR LOS ARCHIVOS UTILIZADOS
		// EN UN FINALLY
		}finally{
			if(entrada!=null){
				try {
					entrada.close();
				} catch (IOException _ioe) {
					System.out.println("No se pudo cerrar el archivo de origen: " + _ioe.getMessage());
				}
			}
		}
		
		return sb.toString().trim();
		
	}
	
	public void escribirArchivo(String archivo, String contenido){
		
		FileWriter salida=null;
		char[] buffer=contenido.toCharArray();
		
		try{
			salida=new FileWriter(archivo);
			salida.write(buffer, 0, buffer.length);
		}catch(IOException ioe){
			System.out.println("Ocurrio un error al acceder a uno de los archivos: " + ioe.getMessage());
		// SIEMPRE CERRAR LOS ARCHIVOS UTILIZADOS
		// EN UN FINALLY
		}finally{
			if(salida!=null){
				try {
					salida.close();
				} catch (IOException _ioe) {
					System.out.println("No se pudo cerrar el archivo de destino: " + _ioe.getMessage());
				}
			}
		}
		
	}
	
	public void testLecturaEscrituraObjeto(){
		
		List<Persona> ps=new ArrayList<Persona>();
		
		ps.add(new Persona(1, "Diego Bonnin", "9999"));
		ps.add(new Persona(2, "Jorge Caceres", "9998"));
		ps.add(new Persona(3, "Camila Armoa", "9997"));
		
		// Serializar en json (tambien hay serializar xml, en txt, etc.)
		ObjectMapper mapper=new ObjectMapper();
		
		String archivo="C:\\438-IPOO-JAVA-OTO2017\\archivos\\persona.txt";
		
		try {
			/*
			String json=mapper.writeValueAsString(ps);
			escribirArchivo(archivo, json);
			
			System.out.println("****");
			*/
			
			String jsonLeido=leerArchivo(archivo);
			
			
			System.out.println("Leido: " + jsonLeido);
			// Deserializar
			
			List<Persona> otraInstancia=mapper.readValue(jsonLeido,  new TypeReference<List<Persona>>(){});
			
			
			System.out.println("Otra instancia: " + otraInstancia);
			
			/*
			
			String jsonOtraInstancia=mapper.writeValueAsString(otraInstancia);
			
			escribirArchivo(otroArchivo, jsonOtraInstancia);
			
			*/
			
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			System.out.println("Hubo un problema al convertir en json");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("No va a llegar aka");
		
	}
	
	public static void main(String[] args) {
		/*
		String origen="C:\\438-IPOO-JAVA-OTO2017\\archivos\\origen.txt";
		String destino="C:\\438-IPOO-JAVA-OTO2017\\archivos\\destino.txt";
		String destino2="C:\\438-IPOO-JAVA-OTO2017\\archivos\\destino2.txt";
		ArchivosClase a=new ArchivosClase();
		// Copio
		a.copiar(origen, destino);
		// Leo el nuevo archivo
		String lectura=a.leerArchivo(destino);
		String contenido=lectura + ". Despues de leer";
		// Guardo modificado en otro archivo
		System.out.println("Leido: " + contenido);
		a.escribirArchivo(destino2, contenido);
		*/
		
		ArchivosClase a=new ArchivosClase();
		a.testLecturaEscrituraObjeto();
	}

}
