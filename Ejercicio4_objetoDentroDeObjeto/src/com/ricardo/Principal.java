package com.ricardo;

import com.ricardo.models.DatosUsuario;
import com.ricardo.models.DireccionUsuario;

public class Principal {

	public static void main(String[] args) {
		
		DatosUsuario ricky = new DatosUsuario();
			ricky.nombre="Lázaro Ricardo";
			ricky.apellido="Fernández";
			ricky.email="Ricardo@hotmail.com";
			ricky.edad=28;
			
		DireccionUsuario casa = new DireccionUsuario();
			casa.ciudad="Madrid";
			casa.calle="C/Rosa";
			casa.numero=8;
			
			ricky.vivienda=casa;
			
		System.out.println(ricky.obtenerDatosCompletos());
		
		
		
		
		
		
	}

}
