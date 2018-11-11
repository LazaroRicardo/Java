package com.ricardo.models;

public class DatosUsuario {

	public String nombre;
	public String apellido;
	public String email;
	public int edad;
	
	public DireccionUsuario vivienda;
	
	public String obtenerDatosCompletos() {
	
		String datosUsuario= "Nombre:"+" "+this.nombre+" "+this.apellido+" "+"email:"+this.email+" "+"edad:"+this.edad+"\nDirección: "+this.vivienda.obtenerDatosDirecion();
		return datosUsuario;
	}
}
