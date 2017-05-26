package com.diegobonnin.ipoo.practicas;

import java.math.BigDecimal;
import java.util.Date;

public class Asignaciones {
	
	// Variable primitiva int, exclusivamente cuando 
	// hay que reducir al maximo el tama�o de cada clase
	private int a;
	// Variable objeto int, preferentemente esta forma
	private Integer objA;
	
	// valor decimal largo
	private double b;
	private Double obtb;
	// un solo caracter
	private char c;
	// valor decimal corto
	private float f;
	// valor booleano
	private boolean bool;
	// entero largo
	private long l;
	// entero corto
	private short s;
	
	// Cadena de caracteres
	private String str;
	
	// Numero decimal para valores de alta precici�n
	private BigDecimal bd;
	
	private byte bit;
	
	private Persona persona;
	
	private Date fechaHora;
	
	
	// Alcance o en ingles "scope"
	public void test(){
		
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de objA: " + objA);
		System.out.println("Valor de b: " + b);
		// variable = valor (que puede ser otra variable, o un "literal"
		// literares: 1, 5, "juan", true
		objA=2;
		a=1;
		
		System.out.println("Valor de objA despues de asignar: " + objA);
		objA=a;
		System.out.println("Valor de objA despues de asignar valor de a: " + objA);
		

		objA=new Integer(3);
		
		int _a=objA;
		System.out.println("_a: " + _a);
		Integer _c=_a;
		System.out.println("_c: " + _c);
		
		System.out.println("Valor de objA despues de asignar un nuevo valor: " + objA);
		
		// Asignacion de un caracter:
		c='A';
		// Asignacion de booleano
		bool=true;
		// Asignacion de double
		b=1.05d;
		// Asignación de un float, por defecto los valores con decimal
		// son double, hay que agregar la "f" para convertirlos en float
		f=1.05f;
		// Asignación de un long
		l=10l;
		// por defecto, son int los valores enteros
		a=10;
		// Literal de String, en java las cadenas de caracteres
		// son objetos inmutables, una vez creadas, no varian
		// por ende, por mas que muchas variables las referencien
		// hay un solo objeto.
		str="Este es un literal de string";
		str=new String("Otra forma de asignar un String");
		String str2="Este es un literal de string";
		// Crea otra instancia, por mas que hay exista una
		String str3=new String("Este es un literal de string");
		
		System.out.println(str2);
		
		System.out.print(str2);
		System.out.print(str3);
		
		System.out.println();
		
		persona=new Persona();
		System.out.println("Nombre: " + persona.getNombre());
		persona.setNombre("Diego Bonnin");
		System.out.println("Nombre: " + persona.getNombre());
		
		Persona persona2=null;
		
		persona2=new Persona();		
		persona2.setNombre("Alejandro");
		
		System.out.println("Nombre Persona 2: " + persona2.getNombre());
		
		persona2=persona;
		
		System.out.println("Nombre Persona 2: " + persona2.getNombre());
		
		// Importante, cuando asigno null, se pierde la información
		// a menos que este referenciada en otro lugar
		Persona persona3=persona;
		persona=null;
		persona2=persona;
		
		System.out.println("Nombre Persona 2: " + persona2);
		System.out.println("Nombre Persona: " + persona);
		
		System.out.println("Nombre Persona 3: " + persona3.getNombre());
		
		// Se fue para siempre, por ende
		// libere memoria
		persona3=null;
		
		System.out.println("Nombre Persona 3: " + persona3.getNombre());
		
		
	}
	
	public static void main(String[] args){
		Asignaciones a=new Asignaciones();
		a.test();
	}

}
