package com.ricardo;
//Así se consiguen 1000 mascotas enumeradas de forma sencilla:
public class Mascotitas_casa {

	public static void main(String[] args) {
		
		
		String[] listaMascotas = new String [1000];
		
		for (int i = 0; i < listaMascotas.length; i++) {
			listaMascotas[i] = "perro" + i;
			System.out.println("La mascota"+" "+(i+1)+" "+"es"+" "+listaMascotas[i]);
		}
		
		
		
	}	
//		public static String nombreMascotas() {
//			String[] nombresSueltos = new String[10];
	//	
	//		nombresSueltos[0]="Moquete";
	//		nombresSueltos[1]="Cansino";
	//		nombresSueltos[2]="Resultón";
	//		nombresSueltos[3]="Lentorro";
	//		nombresSueltos[4]="Dormilón";
	//		nombresSueltos[5]="Luna";
	//		nombresSueltos[6]="Bobo";
	//		nombresSueltos[7]="Chipi";
	//		nombresSueltos[8]="Cuchu";
	//		nombresSueltos[9]="Lexy";		
	//	}
		
		
		
		

	}


