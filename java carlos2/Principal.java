package Ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula pelicula = new Pelicula();
		pelicula.PedirDatos();
		System.out.println(pelicula.MostrarDatos());
		
		Disco disco = new Disco();
		disco.PedirDatos();
		System.out.println(disco.MostrarDatos());
		
		Disco disco1 = new Disco("OPA", "Manolo","wav", 200, "pop");
		System.out.println(disco1.MostrarDatos());
	}

}
