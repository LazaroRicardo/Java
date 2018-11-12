package Ejercicio_1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora hora = new Hora(5,20);
		Fecha fecha = new Fecha(2017, 3, 15);
		Hora hora1 = new Hora(3,12);
		Fecha fecha1 = new Fecha(2017, 7, 01);
		Hora hora2 = new Hora(16,50);
		Fecha fecha2 = new Fecha(2017,11,26);
		Examen examen = new Examen("Programación", 32,fecha,hora);
		Examen examen1 = new Examen("Lenguaje de Marcas", 31, fecha1, hora1);
		Examen examen2 = new Examen("Bases de Datos", 31 , fecha2 , hora2);
		
		
		System.out.println(examen.MostrarDatos());
		System.out.println(examen1.MostrarDatos());
		System.out.println(examen2.MostrarDatos());
		
		hora.setHoras(21);
		hora.setMinutos(30);
		
		System.out.println(examen.MostrarDatos());

	}

}
