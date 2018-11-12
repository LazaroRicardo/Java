package Ejercicio_1;

public class Fecha {

	//pongo los atributos privated para que solo los pueda cambiar esta clase
	private int Mes;
	private int Año;
	private int Dia;
	
	
	//Creo el constructor vacio para que por defecto se use para pedir los valores despues por teclado
	public Fecha() {
		
	}
	
	
	//Creo este constructor por si no hace falta pedir los valores por teclado los introduzca yo
	public Fecha(int año, int mes, int dia){
		
		this.Año = año;
		this.Mes = mes;
		this.Dia = dia;
	}
	
	//Los getters y los setter son unos metodos que nos permiten dar valores a los atributos
	//y tambien nos sirven para obtener dicho valor 
	public int getMes() {
		return Mes;
	}

	public void setMes(int mes) {
		Mes = mes;
	}

	public int getAño() {
		return Año;
	}

	public void setAño(int año) {
		Año = año;
	}

	public int getDia() {
		return Dia;
	}

	public void setDia(int dia) {
		Dia = dia;
	}
	 public String MostrarDatos(){
		 return Dia + "/" + Mes + "/" + Año;
	 }
}
