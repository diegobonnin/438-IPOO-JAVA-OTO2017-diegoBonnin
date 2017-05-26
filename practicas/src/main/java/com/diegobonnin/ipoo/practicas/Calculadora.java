package com.diegobonnin.ipoo.practicas;

public class Calculadora {
	
	public int sumar(int sumando1, int sumando2){
		/* como programa la abuelita del profesor
		
		int suma=0;
		suma=sumando1+sumando2;
		return suma;
		
		*/
		// operador aritmético de suma +
		return sumando1 + sumando2;
	}
	
	public int restar(int minuendo, int sustraendo)throws Exception{
		
		int diferencia=0;
		// si minuendo es "menor que" sustraendo
		if(minuendo < sustraendo){
			throw new Exception("El sustraendo no puede ser mayor que el minuendo");
		// si minuendo es igual a cero
		}else if(minuendo==0){
			throw new Exception("El minuendo no puede ser 0");
		// si no, resto
		}else{
			// operador aritmético de resta -
			diferencia=minuendo-sustraendo;
		}
		
		return diferencia;
		

		
	}
	
	public int multiplicar(int multiplicando, int multiplicador){
		int producto=0;
		// operador aritmético de multiplicación
		producto=multiplicando * multiplicador;
		return producto;
	}
	
	public int dividir(int dividendo, int divisor)throws Exception{
		// Operador de comparación "igual que" ==
		// or ||
		if(divisor == 0 || divisor > dividendo){
			throw new Exception("No se puede dividir por cero, ni tampoco puede ser menor al dividendo");
		}
		int cociente=0;
		// operador aritmético de división /
		cociente=dividendo / divisor;
		return cociente;
	}
	
	public int resto(int dividendo, int divisor){
		int resto=0;
		// operador aritmético de módulo % (lo que sobra en una división)
		resto=dividendo % divisor;
		return resto;		
	}
	
	public int incrementar(int valor){
		// equivalente a valor=valor+1;
		// cuando esta atras, primero devuelve el valor y luego incrementa
		//valor++;
		// return valor;
		// Si esta adelante, primero incrementa y despues devuelve
		return ++valor;
	}
	
	public int decrementar(int valor){
		// equivalente a valor=valor-1;
		valor--;
		return valor;
	}
	
	public static void main(String[] args) throws Exception{
		
		Calculadora c=new Calculadora();
		
		int a=4;
		int b=10;
		
		System.out.println(a + " + " + b + ": " + c.sumar(a, b));
		// System.out.println(a + " - " + b + ": " + c.restar(a, b));
		System.out.println(a + " * " + b + ": " + c.multiplicar(a, b));
		System.out.println(a + " / " + b + ": " + c.dividir(a, b));
		System.out.println(a + " % " + b + ": " + c.resto(a, b));
		System.out.println("***************");
		System.out.println("++ : " + c.incrementar(a));
		System.out.println("-- : " + c.decrementar(a));
		
		int valor=c.restar(a,  b);
		int otroValor=c.sumar(valor, b);
		System.out.println(otroValor);
		
		
		// comparaciones
		
		int f=6;
		int g=6;
		
		System.out.println("f: " + f);
		System.out.println("g: " + g);
		
		
		
		System.out.println(f + " es menor a " + g + " : " + (f < g));
		System.out.println(f + " es mayor a " + g + " : " + (f > g));
		System.out.println(f + " es igual a " + g + " : " + (f == g));
		System.out.println(f + " es menor o igual a " + g + " : " + (f <= g));
		System.out.println(f + " es mayor o igual a " + g + " : " + (f >= g));
		
		
		String s1=new String("Cadena de texto");
		String s2=new String("Cadena de texto1");
		
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		
		System.out.println(s1 + " es igual a " + s2 + " : " + (s1 == s2));
		System.out.println(i1 + " es igual a " + i2 + " : " + (i1 == i2));
		
		System.out.println(s1 + " es igual a " + s2 + " : " + (s1.equals(s2)));
		System.out.println(i1 + " es igual a " + i2 + " : " + (i1.equals(i2)));
		
	}

}
