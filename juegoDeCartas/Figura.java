package juegoDeCartas;

public enum Figura {
	AS(1),
	DOS(2),
	TRES(3), 
	CUATRO(4),
	CINCO(5),
	SEIS(6),
	SIETE(7),
	SOTA(0.5),
	CABALLO(0.5),
	REY(0.5);

	private final double puntuacion;

	Figura(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	double puntuacion() {
		return puntuacion;
	}
}
