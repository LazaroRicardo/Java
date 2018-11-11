package com.ricardo;

import com.ricardo.models.Direccion;
import com.ricardo.models.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		//pepito es una variable apuntando a una posición de memoria:
		Usuario pepito = new Usuario();
		
		//asignación de valor de cada atributo:
		pepito.nombre="Pepe";
		pepito.apellido="Pérez";
		pepito.email="pepe@pepiton.com";
		pepito.edad=30;
		
		Direccion casa = new Direccion();
		
		casa.calle="Calle Penélope";
		casa.ciudad="Madrid";
		casa.numero=8;
		//pepito.dir="casa";//cazando perros con gorilas, se refiere a que no ponga comillas al enlazar una clase con otra.
		pepito.dir=casa;
		//unión de 2 atributos:System.out.println(pepito.nombre+" "+pepito.apellido);
		//Lo siguiente es la unión de todos los atributos:
		System.out.println(pepito.getDatosCompletos());
	}

	
}
   
		