package com.diegobonnin.ipoo.practicas.archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.diegobonnin.ipoo.practicas27052017.Persona;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Archivos {
	
	public void copiar(String origen, String destino){
		
		FileInputStream entrada=null;
		FileOutputStream salida=null;
		
		try{
			
			entrada=new FileInputStream(origen);
			salida=new FileOutputStream(destino);
			
			int c;
			
			while((c=entrada.read()) != -1){
				salida.write(c);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(entrada!=null)
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if(salida!=null)
				try {
					salida.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public String leerArchivo(String archivo){

		FileReader entrada=null;
		char[] buffer=new char[1024];
		StringBuilder sb=new StringBuilder();
		
		try{
	
			entrada=new FileReader(archivo);
			while(entrada.read(buffer, 0, 1024)>0){
				sb.append(buffer);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(entrada!=null)
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		return sb.toString();
		
	}
	
	public void escribirArchivo(String archivo, String contenido){

		FileWriter salida=null;
		char[] buffer=contenido.toCharArray();
		
		try{
	
			salida=new FileWriter(archivo);
			salida.write(buffer, 0, buffer.length);
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(salida!=null)
				try {
					salida.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}	
	
	public void testObjeto(){
		
		Persona p=new Persona(1, "Diego Bonnin", "99999");
		ObjectMapper mapper=new ObjectMapper();
		String json;
		
		try {
			json = mapper.writeValueAsString(p);
			escribirArchivo("C:\\438-IPOO-JAVA-OTO2017\\archivos\\persona.txt", 
					json);
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(leerArchivo("C:\\438-IPOO-JAVA-OTO2017\\archivos\\persona.txt"));
		
	}		
	
	public static void main(String[] args){
		Archivos a=new Archivos();
		/*
		a.copiar(
				"C:\\438-IPOO-JAVA-OTO2017\\archivos\\origen.txt", 
				"C:\\438-IPOO-JAVA-OTO2017\\archivos\\destino.txt"
		);
		*/
		a.testObjeto();
// 		String contenido=a.leerArchivo("C:\\438-IPOO-JAVA-OTO2017\\archivos\\destino.txt");
//		System.out.println(contenido);
	}

}
