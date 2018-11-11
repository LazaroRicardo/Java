package com.ricardo.models;

public class DatosLuisa {

	public String nombre;
	public String email;
	public int edad;
	public String cercania;
	
	public String obtenerDatosluisa() {
	String datos= this.nombre+" "+this.email+" "+this.edad+" "+this.cercania;
	return datos;
	}	
}