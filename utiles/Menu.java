package utiles;

/**
 * Crea la clase Menu. Mételo en el paquete utiles. Implementa al menos los
 * siguientes métodos y atributos: a. titulo b. opciones c. numOpciones d. *
 * gestionar() e. mostrar() f. recogerOpcion()
 * 
 * @author d16golur
 * @version 1.0
 */

public class Menu {
	private String titulo;
	private String [] opciones;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String[] getOpciones() {
		return opciones;
	}

	public void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}

	
	/**
	 * Constructor del menu
	 */
	public Menu(String titulo, String [] opciones){
		setTitulo(titulo);
		setOpciones(opciones);
	}
	/**
	 * Mostrar menu
	 */
	public void mostrar(){
		System.out.println(getTitulo());

		for(int i = 0; i<getOpciones().length; i++){

		System.out.println("("+(i+1)+")"+getOpciones()[i]);

		}

		System.out.println("("+(getOpciones().length+1)+") Salir"); 
		}
	/**
	 * Gestionar menu
	 */
	public int gestionar(){

		mostrar();

		return recogerOpcion();

		}
	private int recogerOpcion(){
		int opcion;
		do{
			opcion=Teclado.leerEntero("Dame una opcion: ");
		}while(opcion<1||opcion>getOpciones().length+1);
			
		return opcion;		
	}
	public int getNumOpciones(){

		return getOpciones().length+1;

		}
	
	}
