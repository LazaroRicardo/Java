package com.ricardo;

public class mascotas_con_nombre {

	public static void main(String[] args) {
		
	String[] listaMascotas = new String [10];
		
		listaMascotas[0]="Moquete";
		listaMascotas[1]="Cansino";
		listaMascotas[2]="Resultón";
		listaMascotas[3]="Lentorro";
		listaMascotas[4]="Dormilón";
		listaMascotas[5]="Luna";
		listaMascotas[6]="Bobo";
		listaMascotas[7]="Chipi";
		listaMascotas[8]="Cuchu";
		listaMascotas[9]="Lexy";
		
	
		for (int i = 0; i < listaMascotas.length; i++) {
			System.out.println("El animal nº"+" "+(i+1)+" "+"se llama"+" "+listaMascotas[i]);
		}
	}	
}
