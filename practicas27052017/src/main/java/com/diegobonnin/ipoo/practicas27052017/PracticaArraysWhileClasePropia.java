package com.diegobonnin.ipoo.practicas27052017;

import java.util.ArrayList;
import java.util.List;

public class PracticaArraysWhileClasePropia {
	
	// Declaración
	private Persona[] arrayDePersonas;
	private List<Persona> listaDePersonas;
	
	public PracticaArraysWhileClasePropia(){
		// Inicialización
		arrayDePersonas=new Persona[15];
		listaDePersonas=new ArrayList<Persona>();
	}
	
	private void test() {
		
		int valor=0;
		
		// la primera posición es: arrayDePersonas[0], no 1
		
		// inicialización
		int indice=0;
		
		while(indice < arrayDePersonas.length){
			// incremento, una abreviación de valor=valor+1
			valor++;
			
			System.out.println("Asignando: " + valor + " a posición: " + indice);
			
			Persona p=null;
			if(indice==8){
				p=new Persona(5, "Ismael", "11111");
			}else{
				p=new Persona(
						valor, 
						"Persona " + valor,
						"99999" + valor
				);
			}
			
			arrayDePersonas[indice]=p;
			
			// incremento del indice
			indice++;
		}
		
		System.out.println("Indice: " + indice);
		indice=0;
		System.out.println("Indice (Desp): " + indice);
		
		Persona pBuscar=new Persona(5, "Diego", "21111");
		
		// recorrido
		while(indice < arrayDePersonas.length){
			Persona p1=arrayDePersonas[indice];
			System.out.println("arrayDePersonas[" + indice + "]: " 
					+ p1);
			if(p1.equals(pBuscar)){
				System.out.println("Buscado: " + pBuscar);
				System.out.println("Encontrado: " + p1);
			}
			indice++;
		}
		
	}
	
	public void testList(){
		
		int valor=0;
		// tope
		int valorMaximo=10;
		
		System.out.println("(Antes de asignar) Cuantos elementos tiene: " + listaDePersonas.size());
		
		int indice=0;
		while(indice < valorMaximo){
			valor++;
			Persona p=new Persona(valor, "Persona " + valor, "99999" + valor);
			System.out.println("Asignando " + p);
			listaDePersonas.add(p);
			indice++;
		}
		
		System.out.println("(Despues de asignar) Cuantos elementos tiene: " + listaDePersonas.size());
		indice=0;
		
		while(indice<listaDePersonas.size()){
			System.out.println(listaDePersonas.get(indice));
			indice++;
		}
		
		// Quita por indice
		listaDePersonas.remove(0);
		
		// Quita por instancia
		// Primero obtiene el elemento
		Persona elemento=listaDePersonas.get(2);
		// y despues quita elemento
		listaDePersonas.remove(elemento);
		
		System.out.println("************");
		
		for(Persona p: listaDePersonas){
			System.out.println(p);
		}
		
		System.out.println("(Despues de quitar) Cuantos elementos tiene: " + listaDePersonas.size());
		
		listaDePersonas.clear();
		
		System.out.println("Cuantos elementos tiene: " + listaDePersonas.size());
	}
	
	
	public static void main(String[] args){
		PracticaArraysWhileClasePropia pa=new PracticaArraysWhileClasePropia();
		pa.test();
		// pa.testList();
	}


}
