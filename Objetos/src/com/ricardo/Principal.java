package com.ricardo;

import com.ricardo.models.Direccion;
import com.ricardo.models.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		//pepito es una variable apuntando a una posici�n de memoria:
		Usuario pepito = new Usuario();
		
		//asignaci�n de valor de cada atributo:
		pepito.nombre="Pepe";
		pepito.apellido="P�rez";
		pepito.email="pepe@pepiton.com";
		pepito.edad=30;
		
		Direccion casa = new Direccion();
		
		casa.calle="Calle Pen�lope";
		casa.ciudad="Madrid";
		casa.numero=8;
		//pepito.dir="casa";//cazando perros con gorilas, se refiere a que no ponga comillas al enlazar una clase con otra.
		pepito.dir=casa;
		//uni�n de 2 atributos:System.out.println(pepito.nombre+" "+pepito.apellido);
		//Lo siguiente es la uni�n de todos los atributos:
		System.out.println(pepito.getDatosCompletos());
	}

	
}
   
		