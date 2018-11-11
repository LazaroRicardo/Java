package com.ricardo.models;

public class Direccion {

	public String calle;
	public String ciudad;
	public int numero;

	public String getDatos() {
		String datos = this.ciudad + " " + this.calle + " " + this.numero;
		return datos;
	}
}