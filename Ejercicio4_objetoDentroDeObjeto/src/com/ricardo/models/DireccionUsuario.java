package com.ricardo.models;

public class DireccionUsuario {

	public String calle;
	public String ciudad;
	public int numero;
	
	public String obtenerDatosDirecion() {
	String datosDireccion= this.ciudad+" "+this.calle+" "+this.numero;
	return datosDireccion;
	}
	
	
	
}
