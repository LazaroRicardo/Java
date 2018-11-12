package Ejercicio_1;

public class Hora {

	//pongo los atributos privated para que solo los pueda cambiar esta clase
	private int Horas;
	private int Minutos;

	// Creo el constructor vacio para que por defecto se use para pedir los
	// valores despues por teclado
	public Hora() {
		
	}

	// Creo este constructor por si no hace falta pedir los valores por teclado
	// los introduzca yo
	public Hora(int horas,int minutos) {
	
		this.Horas = horas;
		this.Minutos = minutos;
	}

	// Los getters y los setter son unos metodos que nos permiten dar valores a
	// los atributos
	// y tambien nos sirven para obtener dicho valor
	public int getHoras() {
		return Horas;
	}

	public void setHoras(int horas) {
		Horas = horas;
	}

	public int getMinutos() {
		return Minutos;
	}

	public void setMinutos(int minutos) {
		Minutos = minutos;
	}

	public String MostrarDatos(){
		return Horas + ":" + Minutos;
	}
}
