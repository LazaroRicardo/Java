package com.ricardo;

public class Principal {

	public static void main(String[] args) {
		 
		String[] meses = new String[12];
		
		meses[0]="ene";
		meses[1]="feb";
		meses[2]="mar";
		meses[3]="abr";
		meses[4]="may";
		meses[5]="jun";
		meses[6]="jul";
		meses[7]="agos";
		meses[8]="sep";
		meses[9]="oct";
		meses[10]="nov";
		meses[11]="dic";
		
		
		for (int i = 0; i < meses.length; i++) {
			System.err.println("El mes"+" "+(i+1)+" "+"es"+" "+meses[i]);
		}
		
		//meses del año de 2 en 2=
		for (int i = 0; i < meses.length; i=i+2) {
			System.err.println("El mes"+" "+(i+1)+" "+"es"+" "+meses[i]);
		}
		
		for (String unMes : meses) {
			System.out.println("Un mes:"+unMes);
		}
		
		
	}

}
