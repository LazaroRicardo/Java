package Ejercicio_1;

public class Examen {

	//pongo el private para que solo puedan usarlos esta clase
	private String Nombre;
	private int Aula;
	//uso la clase Fecha y Hora referenciando a las clases que he creado a parte 
	private Fecha Fecha;
	private Hora Hora;
	
	//Creo el constructor vacio para que por defecto se use para pedir los valores despues por teclado
	public Examen(){
		
	}
	
	//Creo este constructor por si no hace falta pedir los valores por teclado los introduzca yo
	public Examen(String nombre, int aula, Fecha fecha, Hora hora){
		this.Nombre = nombre;
		this.Aula  = aula;
		this.Fecha = fecha;
		this.Hora = hora;
		}

	//Los getters y los setter son unos metodos que nos permiten dar valores a los atributos
	//y tambien nos sirven para obtener dicho valor 
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getAula() {
		return Aula;
	}

	public void setAula(int aula) {
		Aula = aula;
	}

	public Fecha getFecha() {
		return Fecha;
	}

	public void setFecha(Fecha fecha) {
		Fecha = fecha;
	}

	public Hora getHora() {
		return Hora;
	}

	public void setHora(Hora hora) {
		Hora = hora;
	}
	
	//Creo el metodo MostrarDatos que es un toString para mostrar por pantalla el resultado como una frase con sentido
	public String MostrarDatos(){
		return "El examen de " + this.Nombre + " es en el aula " + this.Aula + " el día " + Fecha.MostrarDatos() + " a las " + Hora.MostrarDatos();
	}
}
