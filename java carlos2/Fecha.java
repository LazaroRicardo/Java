package Ejercicio_1;

public class Fecha {

	//pongo los atributos privated para que solo los pueda cambiar esta clase
	private int Mes;
	private int A�o;
	private int Dia;
	
	
	//Creo el constructor vacio para que por defecto se use para pedir los valores despues por teclado
	public Fecha() {
		
	}
	
	
	//Creo este constructor por si no hace falta pedir los valores por teclado los introduzca yo
	public Fecha(int a�o, int mes, int dia){
		
		this.A�o = a�o;
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

	public int getA�o() {
		return A�o;
	}

	public void setA�o(int a�o) {
		A�o = a�o;
	}

	public int getDia() {
		return Dia;
	}

	public void setDia(int dia) {
		Dia = dia;
	}
	 public String MostrarDatos(){
		 return Dia + "/" + Mes + "/" + A�o;
	 }
}
