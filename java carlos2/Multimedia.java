package Ejercicio2;

//importo el Scanner para poder utilizarlo mas tarde
import java.util.Scanner;

public class Multimedia {

	//Pongo aqui el scanner con public y static para que los puedan usar las otras clases sin pedirlas en cada una de ellas
	public static Scanner sc = new Scanner(System.in);
	
	//pongo los atributos en protected para que las clases hijas las hereden y las puedan usar
	protected String Titulo;
	protected String Autor;
	protected String Formato;
	protected int Duracion;
	
	//Creo el constructor vacio para que por defecto se use para pedir los valores despues por teclado
	public Multimedia(){
		
	}
	
	//Creo este constructor por si no hace falta pedir los valores por teclado los introduzca yo
	public Multimedia(String titulo, String autor, String formato, int duracion){
		this.Titulo = titulo;
		this.Autor = autor;
		this.Formato = formato;
		this.Duracion = duracion;
	}

	//Los getters y los setter son unos metodos que nos permiten dar valores a los atributos
	//y tambien nos sirven para obtener dicho valor 
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getFormato() {
		return Formato;
	}

	public void setFormato(String formato) {
		Formato = formato;
	}

	public int getDuracion() {
		return Duracion;
	}

	public void setDuracion(int duracion) {
		Duracion = duracion;
	}
	
	//Creo el metodo para comprobar el dato que me va a introducir por teclado
	public void ComprobarFormato(){
		System.out.println("Introduzca el tipo de formato");
		String a = sc.nextLine();
			
		//creo una comprobacion para saber si lo que me ha escrito esta bien
		if(a == ""){
			 a = "multimedia";
			 this.Formato = a;
		}else if(a == "wav" || a == "mp3" || a == "cdAudio" || a  == "dvd"){
			this.Formato = a;
		}
	}
	
	//Creo el metodo para pedir datos por el cual le pido por pantalla cada cosa y la guardo en cada atributo
	public void PedirDatos(){
		System.out.println("Introduzca el título");
		this.Titulo = sc.nextLine();
		
		System.out.println("Introduzca el autor");
		this.Autor = sc.nextLine();

		ComprobarFormato();

		System.out.println("Introduzca la duración en segundos");
		this.Duracion = sc.nextInt();

	}
	
	//hago el metodo toString para despues mostrar por pantalla los datos
	public String MostrarDatos(){
		return "El título es: " + this.Titulo + ", el autor es: " + this.Autor + ", el formato es: " + this.Formato + ", la duración es: " + this.Duracion + " segundos";
	}
}
