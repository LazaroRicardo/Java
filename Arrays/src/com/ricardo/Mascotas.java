package com.ricardo;

//random es una importaci�n:
import java.util.Random;

public class Mascotas {

	public static void main(String[] args) {

		String[] listaMascotas = new String[1000];

		// Llenar el array:
		for (int i = 0; i < listaMascotas.length; i++) {
			
			//listaMascotas[i] = "Perrito" + i;
			listaMascotas[i] = generaNombre();
			
			// Escupir el array:
			System.out.println("La mascota" + " " + listaMascotas[i] + " " + "es el perro n�mero" + " " + (i + 1));
		}

	}// Fin del main

	public static String generaNombre() {
		String[] nombresSueltos = new String[20];
		nombresSueltos[0] = "Tango";
		nombresSueltos[1] = "Feo";
		nombresSueltos[2] = "Monstruo";
		nombresSueltos[3] = "Ner�n";
		nombresSueltos[4] = "Canela";
		nombresSueltos[5] = "Lucky";
		nombresSueltos[6] = "Roco";
		nombresSueltos[7] = "Luna";
		nombresSueltos[8] = "Manso";
		nombresSueltos[9] = "Azul";
		nombresSueltos[10] = "Lila";
		nombresSueltos[11] = "Perrot�n";
		nombresSueltos[12] = "Ringo";
		nombresSueltos[13] = "Ataca";
		nombresSueltos[14] = "Dormil�n";
		nombresSueltos[15] = "Moquete";
		nombresSueltos[16] = "Tranquilico";
		nombresSueltos[17] = "Pesado";
		nombresSueltos[18] = "Cansino";
		nombresSueltos[19] = "Zozor";

		// hemos importado random en la l�nea 2 y ahora metemos la funci�n debajo con 2
		// int para general nombre compuesto:
		Random rand = new Random();

		int n1 = rand.nextInt(20);
		int n2 = rand.nextInt(20);

		String nombreADevolver = nombresSueltos[n1] + " " + nombresSueltos[n2];

		return nombreADevolver;
	}
}
