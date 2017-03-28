package juegoDeCartas;

public class Jugador {
	String nombre;
	int partidasGanadas = 0;
	int partidasPerdidas = 0;
	double puntuacion = 0;

	/**
	 * Constructor del objeto Jugador
	 * 
	 * @param nombre
	 */
	
	Jugador(String nombre) {
		this.nombre = nombre;
	}
	Integer ganadas(){
		return partidasGanadas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	void sumarPuntuacion(double valor){
		this.puntuacion=puntuacion+valor;
	}
	 
	 public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	void aumentarGanadas(){
		 this.partidasGanadas++;
	 }
	 void aumentarPerdidas(){
		 this.partidasPerdidas++;
	 }

	@Override
	public String toString() {
		return  nombre +" \t| PG  [" + partidasGanadas + "]\t| PP ["
				+ partidasPerdidas + "]\n";
	}
	public void puntosACero() {
		setPuntuacion(0);
		
	}

	}

	 

