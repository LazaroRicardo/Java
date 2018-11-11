package com.ricardo;

import java.util.Random;

public class Mascotitas_nombre_random {

	public static void main(String[] args) {
		
	String[] listaMascotas = new String [1000];
		
		for (int i = 0; i < listaMascotas.length; i++) {
			listaMascotas[i] = nombreMascotas();
			System.out.println("El animal nº"+" "+(i+1)+" "+"se llama"+" "+listaMascotas[i]);
		}
	}	
	
		public static String nombreMascotas() {
			String[] nombresSueltos = new String[10];
		
			nombresSueltos[0]="Moquete";
			nombresSueltos[1]="Cansino";
			nombresSueltos[2]="Resultón";
			nombresSueltos[3]="Lentorro";
			nombresSueltos[4]="Dormilón";
			nombresSueltos[5]="Luna";
			nombresSueltos[6]="Bobo";
			nombresSueltos[7]="Chipi";
			nombresSueltos[8]="Cuchu";
			nombresSueltos[9]="Lexy";		
		
		Random rand = new Random();

		int n1 = rand.nextInt(10);
		int n2 = rand.nextInt(10);

		String nombreADevolver = nombresSueltos[n1] +" "+ nombresSueltos[n2];
		return nombreADevolver;
		}
}
