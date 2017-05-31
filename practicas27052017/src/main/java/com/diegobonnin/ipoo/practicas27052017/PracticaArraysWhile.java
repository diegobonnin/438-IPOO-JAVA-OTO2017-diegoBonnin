package com.diegobonnin.ipoo.practicas27052017;

import java.util.ArrayList;
import java.util.List;

public class PracticaArraysWhile {
	
	private int[] arrayDeEnteros;
	private List<Integer> listaDeEnteros;
	
	public PracticaArraysWhile(){
		arrayDeEnteros=new int[15];
		listaDeEnteros=new ArrayList<Integer>();
	}
	
	private void test() {
		
		int valor=0;
		
		// la primera posición es: arrayDeEnteros[0], no 1
		
		// inicialización
		int indice=0;
		
		while(indice < arrayDeEnteros.length){
			// incremento, una abreviación de valor=valor+1
			valor++;
			System.out.println("Asignando: " + valor + " a posición: " + indice);
			arrayDeEnteros[indice]=valor;
			// incremento del indice
			indice++;
		}
		
		System.out.println("Indice: " + indice);
		indice=0;
		System.out.println("Indice (Desp): " + indice);
		
		// recorrido
		while(indice < arrayDeEnteros.length){
			System.out.println("arrayDeEnteros[" + indice + "]: " 
					+ arrayDeEnteros[indice]);
			indice++;
		}
		
	}
	
	public void testList(){
		
		int valor=0;
		// tope
		int valorMaximo=10;
		
		System.out.println("(Antes de asignar) Cuantos elementos tiene: " + listaDeEnteros.size());
		
		int indice=0;
		while(indice < valorMaximo){
			valor++;
			System.out.println("Asignando " + valor);
			listaDeEnteros.add(valor);
			indice++;
		}
		
		System.out.println("(Despues de asignar) Cuantos elementos tiene: " + listaDeEnteros.size());
		indice=0;
		
		while(indice<listaDeEnteros.size()){
			System.out.println(listaDeEnteros.get(indice));
			indice++;
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
		PracticaArraysWhile pa=new PracticaArraysWhile();
		// pa.test();
		pa.testList();
	}


}
