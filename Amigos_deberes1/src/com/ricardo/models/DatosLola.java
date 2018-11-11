package com.ricardo.models;

public class DatosLola {
	
	public String nombre;
	public String email;
	public int edad;
	public String cercania;
	
	public String obtenerDatoslola() {
		
	String datos= this.nombre+" "+this.email+" "+this.edad+" "+this.cercania;
	return datos;
	}
}