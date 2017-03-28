package juegoDeCartas;

import java.util.ArrayList;

import utiles.Teclado;

public class Partida {
	Baraja baraja;
	ArrayList<Jugador> participantes;
	final double sieteYMedia = 7.5;

	Partida(ArrayList<Jugador> participantes2) {
		this.participantes = participantes2;
	}

	double sacarCarta(){
		Carta carta = baraja.extraerCarta();
		System.out.println("Has sacado -> "+carta.toString());
		double valor = carta.getFigura().puntuacion();
		System.out.println("Vale ->"+valor);
		return valor;
	}
	
	private void jugada(Jugador jugador){
		do {
			jugador.sumarPuntuacion(sacarCarta());
			// saca una carta del montón, acumula puntos y quita la carta
		} while (Teclado.deseaContinuar("desea otra carta? S - N")
				&& comprobarPuntos(jugador));
	}


	private boolean comprobarPuntos(Jugador jugador) {
		if (jugador.getPuntuacion() > sieteYMedia) {
			return false;
		} else if (jugador.getPuntuacion() == sieteYMedia) {
			return false;
		} else
			return true;
	}
	
	private int comprobarPuntuacion(int turno, int ganador) {
		if (sieteYMedia(turno))
			ganador = turno;
		else if (participantes.get(turno).getPuntuacion() < 7.5
				&& participantes.get(turno).getPuntuacion() > participantes
						.get(ganador).getPuntuacion())
			ganador = turno;
		participantes.get(turno).puntosACero();
		return ganador;
	}
		
	private boolean sieteYMedia(int turno) {
		return participantes.get(turno).getPuntuacion()==sieteYMedia;
	}

	void ronda(){
		baraja = new Baraja();
		int turno = 0;
		int ganador = 0;
		do {
			System.out.println("Turno del jugador: "
					+ participantes.get(turno).getNombre());
			jugada(participantes.get(turno));
			System.out.println(participantes.get(turno).getPuntuacion());
			ganador = comprobarPuntuacion(turno, ganador);
			turno++;
		} while (turno < participantes.size()||sieteYMedia(turno-1));
		participantes.get(ganador).aumentarGanadas();
		System.out.println("ganador: " + participantes.get(ganador));
	}
}
