package juegoDeCartas;

import java.util.ArrayList;

import utiles.Menu;
import utiles.Teclado;

public class TestJuegoDeCartas {
	private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private static ArrayList<Jugador> participantes = new ArrayList<Jugador>();
	private static RankingJugadores ranking;
	private static Partida partida = new Partida(participantes);
	private static Menu menuPrincipal = new Menu("-------Siete y Media----------",
			new String[] { "Añadir Jugadores ", "Jugar", "Ranking" });

	public static void main(String[] args) {
		jugadores.add(new Jugador("Gomez"));
		jugadores.add(new Jugador("Manu"));
		jugadores.add(new Jugador("Invitado"));
		int opcion;
		do {
			opcion = menuPrincipal.gestionar();

			switch (opcion) {
			case 1:// AÑADIR JUGADORES
					// ****************************************************************///

				Menu menuJugadores = new Menu("--------Añadir Jugador------------",
						new String[] { "Crear nuevo jugador", "Ver lista de Jugadores" });
				int opcionJ;
				do {
					opcionJ = menuJugadores.gestionar();
					switch (opcionJ) {
					case 1:// CREAR NUEVO JUGADOR
						crearJugador(Teclado.leerCadena("Introduce el nombre del jugador: "));
						break;
					case 2:// VER LISTA DE JUGADORES
						System.out.println(mostrar(jugadores));
						break;
					default:
						System.out.println("ADIOS!");
					}
				} while (opcionJ != menuJugadores.getNumOpciones());
				// **************************************************************///
				break;
			case 2:// JUGAR
				añadirParticipantes();
				partida.ronda();
				break;
			case 3:// RANKING
				ranking.setRanking(jugadores);
				ranking.ordenar();
				System.out.println(ranking.toString());
				break;
			default:
				System.out.println("ADIOS!");

			}
		} while (opcion != menuPrincipal.getNumOpciones());

	}

	private static void añadirParticipantes() {
		do {
			System.out.println(mostrar(jugadores));
			int indice = Teclado.leerEntero("Introduce el indice del jugador:") - 1;
			Jugador j1 = jugadores.get(indice);
			participantes.add(j1);
		} while (Teclado.deseaContinuar("Añadir otro jugador? (S / N"));
	}

	private static void crearJugador(String nombre) {
		jugadores.add(new Jugador(nombre));
	}
	public static String mostrar(ArrayList<Jugador> jugadores) {
		StringBuilder cadena = new StringBuilder("");
		for (int i = 0; i < jugadores.size(); i++) {
			cadena.append("[" + (i + 1) + "] -> " + jugadores.get(i));
		}
		return cadena.toString();
	}

}
