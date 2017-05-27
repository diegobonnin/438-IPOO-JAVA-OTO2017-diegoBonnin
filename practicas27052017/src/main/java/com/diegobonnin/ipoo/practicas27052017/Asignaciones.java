package com.diegobonnin.ipoo.practicas27052017;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Asignaciones {
	
	// variable de tipo short, numeros enteros pequeños (hasta 32,767)
	private short _short;
	// variable de tipo int, numeros enteros pequeños (hasta 2 a la 31-1)
	private int _int;
	// variable de tipo long, numeros enteros pequeños (hasta 2 a la 63-1)
	private long _long;
	// variable de tipo float, numeros con decimales ( hasta 2.000.000.000)
	private float _float;
	// variable de tipo float, numeros con decimales ( mayores 2.000.000.000)
	private double _double;
	
	private boolean _boolean;
	private char _char;
	private String _string;
	private Date _date;
		
	
	public Asignaciones(){
		
	}
	
	public void test(){
		
		System.out.println("****Metodo test*****");
		
		_short=1;
		_int=20;
		_long=50;

		imp("_short", _short + "");
		imp("_int", _int + "");
		imp("_long", _long + "");
		
		// sumar 5 a cada variable, y luego imprimir (de nuevo)
		_short=(short)(_short + 5);
		// los literales de número son siempre int
		imp("_short", _short + "");
		
		_int= _int + 5;
		imp("_int", _int + "");
		
		_long=_long + 5;
		imp("_long", _long + "");
		
		_float=1.0f;		
		_double=2.0d;
		
		imp("_float", _float + "");
		imp("_double", _double + "");
		
		_float=6.0f;		
		_double=7.0d;
		
		imp("_float", _float + "");
		imp("_double", _double + "");
		
		_char='A';
		
		imp("_char", _char + "");
		
		_string="AA";
		imp("_string", _string + "");
		
		_char='D';
		imp("_char", _char + "");
		
		_string="BB";
		imp("_string", _string);
		
		_boolean=true;
		
		imp("_boolean", _boolean + "");
		
		_boolean=false;
		imp("_boolean", _boolean + "");
		
		// Crea una instancia con la fecha y hora actual del equipo
		_date=new Date();
		imp("_date", _date + "");
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		imp("_date", sdf.format(_date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		imp("_date", sdf2.format(_date));
		
		try{
			Thread.sleep(2000l);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		_date=new Date();
		imp("_date", _date + "");
		
		try {
			_date=sdf.parse("20/05/2017");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		imp("_date", sdf2.format(_date));
		
		// Literal de enteros, el 1 en la asignación de abajo
		int a=1;
		// Literal de string
		String s="Este es un literal de string";
		// Literal booleano, el tru de abajo
		boolean b=true;
		// Literal de numeros con decimales, float, el "1.0f" de abajo
		float f=1.0f;
		// Literal de numeros con decimales, double, el "1.0d" de abajo
		double d=1.0d;
		// Literal de char, el 'B' de abajo; 
		char c='B';
		
	}
	
	private void imp(String variable, String valor){
		System.out.println("Valor de " + variable + ": " + valor);
	}
	
	// método para ejecutar una clase java, si no se declara, no se puede
	// ejecutar la clase
	public static void main(String[] args){
		// Instancia de la clase
		Asignaciones a=new Asignaciones();
		// ejecutamos el método test
 		a.test();
		
	}
	
	
	

}
