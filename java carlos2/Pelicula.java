package Ejercicio2;

public class Pelicula extends Multimedia {

	//creo los atributos como private para que solo la pueda usar esta clase 
	private String ActorPrincipal;
	private String ActrizPrincipal;
	
	//constructor por defecto en el que los datos mas tarde lo pido por teclado
	//al ser una herencia hay que poner el super para referenciar a los atributos de la clase padre
	public Pelicula() {
		super();

	}

	//en este constructor los datos los intoduzco yo mas tarde a la hora de crear el objeto
	//como esta referenciado a la clase multimedia necesito el super y meter los atributos dentro 
	public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
		super(titulo, autor, formato, duracion);
		this.ActorPrincipal = actorPrincipal;
		this.ActrizPrincipal = actrizPrincipal;
	}

	//Los getters y los setter son unos metodos que nos permiten dar valores a los atributos
	//y tambien nos sirven para obtener dicho valor 
	public String getActorPrincipal() {
		return ActorPrincipal;
	}


	public void setActorPrincipal(String actorPrincipal) {
		ActorPrincipal = actorPrincipal;
	}


	public String getActrizPrincipal() {
		return ActrizPrincipal;
	}


	public void setActrizPrincipal(String actrizPrincipal) {
		ActrizPrincipal = actrizPrincipal;
	}
	
	//aqui lo que hago es complementar al metodo de la clase padre
	//para ello he llamado al metodo padre y he introducido lo necesario para que meta los datos
	//de los atributos de la clase hija
	public void PedirDatos(){
		super.PedirDatos();
		System.out.println("Introduzca el actor principal");
		this.ActorPrincipal = sc.nextLine();
		sc.nextLine();
		System.out.println("Introduzca la actriz principal");
		this.ActrizPrincipal = sc.nextLine();

	}
	
	//aqui igual que en el metodo anterior
	//llamo al metodo padre y lo complemento para que se ajuste a la clase hija
	public String MostrarDatos(){
		return super.MostrarDatos() + ", el actor principal es: " + this.ActorPrincipal + ", la actriz principal es: " + this.ActrizPrincipal;
	}
}
