package com.ricardo.models;

public class DatosJuan {
	
	public String nombre;
	public String email;
	public int edad;
	public String cercania;
	
	public String obtenerDatosjuan() {
		
	String datos= this.nombre+" "+this.email+" "+this.edad+" "+this.cercania;
	return datos;
	}
}