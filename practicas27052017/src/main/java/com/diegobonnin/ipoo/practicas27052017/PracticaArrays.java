package com.diegobonnin.ipoo.practicas27052017;

public class PracticaArrays {
	
	private int[] arrayDeEnteros;
	
	public PracticaArrays(){
		arrayDeEnteros=new int[30];
	}
	
	private void test() {
		int valor=20;
		
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
	
	
	public static void main(String[] args){
		PracticaArrays pa=new PracticaArrays();
		pa.test();
	}


}
