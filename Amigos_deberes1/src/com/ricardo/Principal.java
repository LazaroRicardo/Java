package com.ricardo;

import com.ricardo.models.DatosPepe;
import com.ricardo.models.DatosJuan;
import com.ricardo.models.DatosPetra;
import com.ricardo.models.DatosLuisa;
import com.ricardo.models.DatosLola;

public class Principal {

	public static void main(String[] args) {

		DatosPepe jose= DatosPepe();
			jose.nombre="Jose Pérez";
			jose.email="jose@gmail.com";
			jose.edad=22;		
		
			DatosLuisa luisa= DatosLuisa();
			luisa.nombre="Luisilda Chimichurri";
			luisa.email="luisi@hotmail.com";
			luisa.edad=24;
			luisa.cercania="cerquita";
	
			DatosJuan juan= DatosJuan();
			juan.nombre="Juan Hernández";
			juan.email="joaoher@gmail.com";
			juan.edad=30;
			juan.cercania="En el quito pino";
		
			DatosPetra petra= DatosPetra();
			petra.nombre="Petronila Curnikova";
			petra.email="petra@hotmail.com";
			petra.edad=25;
			petra.cercania="Muy cerca";

			DatosLola lola= DatosLola();
			lola.nombre="Dolores Moya";
			lola.email="loli@gmail.com";
			lola.edad=20;
			lola.cercania="vecina del quinto";
		
		
			jose.luisa=luisa;
			jose.juan=juan;
			jose.petra=petra;
			jose.lola=lola;
			
			System.out.println(jose.obtenerDatosCompletos());
				
	}
}
