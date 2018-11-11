package com.ricardo.models;

public class Usuario {

	public String nombre;
	public String apellido;
	public String email;
	public int edad;
	// meter objeto dentro de objeto, es decir, meter clase dentro de otra
	// poniendole como nombre para identificarla "dir":
	public Direccion dir;

	//método:
	public String getDatosCompletos() {

		// para acceder a propiedades de una clase uso this:
		//la propiedad dir al pertenecer a otra clase hay que añadir el nombre de su spring:
		String datos = this.nombre + " " + this.apellido + " " + this.email + " " + this.edad+" "+" \nDirección:"+this.dir.getDatos();
		// la variable datos es la que me interesa devolver, la devuelvo así:
		return datos;

	}

}