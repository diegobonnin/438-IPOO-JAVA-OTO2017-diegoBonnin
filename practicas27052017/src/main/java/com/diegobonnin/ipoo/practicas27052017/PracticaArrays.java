package com.diegobonnin.ipoo.practicas27052017;

import java.util.ArrayList;
import java.util.List;

public class PracticaArrays {
	
	private int[] arrayDeEnteros;
	private List<Integer> listaDeEnteros;
	
	public PracticaArrays(){
		arrayDeEnteros=new int[10];
		listaDeEnteros=new ArrayList<Integer>();
	}
	
	private void test() {
		
		int valor=0;
		
		// la primera posición es: arrayDeEnteros[0], no 1
		
		// inicialización
		for(int indice=0; indice < arrayDeEnteros.length; indice++){
			// incremento, una abreviación de valor=valor+1
			valor++;
			System.out.println("Asignando: " + valor + " a posición: " + indice);
			arrayDeEnteros[indice]=valor;
			
		}
		
		// recorrido
		for(int indice=0; indice<arrayDeEnteros.length; indice++){
			System.out.println("arrayDeEnteros[" + indice + "]: " 
		+ arrayDeEnteros[indice]);
		}
		
		
	}
	
	public void testList(){
		
		int valor=0;
		// tope
		int valorMaximo=10;
		
		System.out.println("(Antes de asignar) Cuantos elementos tiene: " + listaDeEnteros.size());
		
		for(int indice=0; indice<valorMaximo ; indice++){
			valor++;
			listaDeEnteros.add(valor);
		}
		
		System.out.println("(Despues de asignar) Cuantos elementos tiene: " + listaDeEnteros.size());
		
		for(Integer i: listaDeEnteros){
			System.out.println(i);
		}
		
		// Quita por indice
		listaDeEnteros.remove(0);
		
		// Quita por instancia
		// Primero obtiene el elemento
		Integer elemento=listaDeEnteros.get(2);
		// y despues quita elemento
		listaDeEnteros.remove(elemento);
		
		System.out.println("************");
		
		for(Integer i: listaDeEnteros){
			System.out.println(i);
		}
		
		System.out.println("(Despues de quitar) Cuantos elementos tiene: " + listaDeEnteros.size());
		
		listaDeEnteros.clear();
		
		System.out.println("Cuantos elementos tiene: " + listaDeEnteros.size());
	}
	
	
	public static void main(String[] args){
		PracticaArrays pa=new PracticaArrays();
		// pa.test();
		pa.testList();
	}


}
