package Ejercicio2;

public class Disco extends Multimedia {

	private String Genero;

	public Disco() {
		super();
	}

	public Disco(String titulo, String autor, String formato, int duracion,
			String genero) {
		super(titulo, autor, formato, duracion);
		this.Genero = genero;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public void PedirDatos() {
		super.PedirDatos();
		System.out.println("Introduzca el género");
		this.Genero = sc.nextLine();
		sc.nextLine();


	}

	public String MostrarDatos() {
		return super.MostrarDatos() + ", el género es: " + this.Genero;
	}

}
