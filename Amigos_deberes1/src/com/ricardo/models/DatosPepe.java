package com.ricardo.models;

public class DatosPepe {
	
	public String nombre;
	public String email;
	public int edad;
	
	public DatosLuisa luisa;
	public DatosJuan juan;
	public DatosPetra petra;
	public DatosLola lola;
	
	public String obtenerDatosCompletos() {
	
		String datosUsuario= "Nombre:"+" "+this.nombre+" "+"email:"+this.email+" "+"edad:"+this.edad+"\nAmigos:"+" "+this.luisa.obtenerDatosluisa();
		return datosUsuario;
	}
}



//+"\n"+this.juan.obtenerDatosjuan()+"\n"+this.petra.obtenerDatospetra()+"\n"+this.luisa.obtenerDatoslola()+"\n"