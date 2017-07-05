package com.diegobonnin.ipoo.repuestos.storage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {
	
	public Archivos(){
	}
	
	public void copiar(String origen, String destino){
		
		System.out.println("Copiando de " + origen + " a " + destino);
		
		FileInputStream entrada=null;
		FileOutputStream salida=null;
		
		try{
			// Abri los archivos
			entrada=new FileInputStream(origen);
			salida=new FileOutputStream(destino);
			
			int c;
			// mientras lea de entrada y no sea -1, escribo en la salida
			while((c=entrada.read())!=-1) salida.write(c);
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			if(entrada!=null){
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(salida!=null){
				try {
					salida.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public String leer(String archivo){
		
		System.out.println("Leyendo de " + archivo);
		
		FileReader entrada=null;
		char[] buffer=new char[1024];
		StringBuilder sb=new StringBuilder();
		
		try{
			// Abri los archivos
			entrada=new FileReader(archivo);
			// Leo y agrego al StringBuilder
			while(entrada.read(buffer)>0) sb.append(buffer);
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			if(entrada!=null){
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// Retorno el contenido
		return sb.toString();
		
	}
	
	public static void main(String[] args){
		
		String base="C:\\438-IPOO-JAVA-OTO2017\\archivos";
		
		String origen="origen.txt";
		String destino="destino.txt";
		
		Archivos a=new Archivos();
		a.copiar(base + "\\" + origen, base + "\\" + destino);
		
		// Lectura
		
		String contenido=a.leer(base + "\\" + origen);
		System.out.println("Leido: " + contenido);
		
	}

}
