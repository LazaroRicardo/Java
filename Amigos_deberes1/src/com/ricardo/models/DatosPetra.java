package com.ricardo.models;

public class DatosPetra {
	
	public String nombre;
	public String email;
	public int edad;
	public String cercania;
	
	public String obtenerDatospetra() {
		
	String datos= this.nombre+" "+this.email+" "+this.edad+" "+this.cercania;
	return datos;
	}
}