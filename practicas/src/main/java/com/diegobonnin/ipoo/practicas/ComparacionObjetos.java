package com.diegobonnin.ipoo.practicas;

public class ComparacionObjetos {
	
	public static void main(String[] args){
		Persona a=new Persona();
		a.setNombre("Diego Bonnin");
		a.setNroDoc("9999999");
		
		Persona b=new Persona();
		b.setNombre("Diego Acosta");
		b.setNroDoc("9999999");
		
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		System.out.println("Esta es una persona: " + b);
		
		//Concatenacion de strings
		// el operador de suma (+) está "sobrecargado"
		// para cumplir dos funciones, suma aritmética
		// y concatenación de strings
		
		String s1="Primera parte";
		String s2=", segunda parte";
		String s3=s1 + s2;
		
		System.out.println(s3);
		
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.append(s2);
		
		System.out.println(sb.toString());

	}

}
