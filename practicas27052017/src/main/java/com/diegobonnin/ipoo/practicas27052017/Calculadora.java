package com.diegobonnin.ipoo.practicas27052017;

public class Calculadora {
	
	public int sumar(int sumando1, int sumando2){
		int suma=0;
		// operador de suma "+"
		suma=sumando1 + sumando2;
		return suma;
	}
	
	public int restar(int minuendo, int sustraendo){
		int resto=0;
		// operador de resta "-"
		resto=minuendo - sustraendo;
		return resto;
	}
	
	public int multiplicar(int multiplicando, int multiplicador){
		int producto=0;
		// operador de multiplicación "*"
		producto=multiplicando * multiplicador;
		return producto;
	}
	
	public int dividir(int dividendo, int divisor){
		int cociente=0;
		// operador de división "/"
		cociente=dividendo / divisor;
		return cociente;
	}
	
	public static void main(String[] args){
		Calculadora c=new Calculadora();
		int a=4;
		int b=2;
		System.out.println("Suma: " + c.sumar(a, b));
		System.out.println("Resta: " + c.restar(a, b));
		System.out.println("Mult.: " + c.multiplicar(a, b));
		System.out.println("Div.: " + c.dividir(a, b));
		
	}

}
