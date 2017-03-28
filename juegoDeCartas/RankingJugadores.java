package juegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RankingJugadores {
	private ArrayList<Jugador> ranking;
	

	public ArrayList<Jugador> getRanking() {
		return ranking;
	}

	public void setRanking(ArrayList<Jugador> ranking) {
		this.ranking = ranking;
	}

	RankingJugadores() {
		ranking = new ArrayList<Jugador>();
	}

	void annadir(String nombre) {
		ranking.add(new Jugador(nombre));
	}

	void ordenar() {
		Collections.sort(ranking, new Comparator<Jugador>() {
			@Override
			public int compare(Jugador j1, Jugador j2) {
				return j2.ganadas().compareTo(j1.ganadas());
			}
		});
	}
	
	void aumentarGanadas(Jugador j1){
		ranking.get(ranking.indexOf(j1)).aumentarGanadas();
	}
	void aumentarPerdidas(Jugador j1){
		ranking.get(ranking.indexOf(j1)).aumentarPerdidas();
	}

	Jugador get(int indice) {
		return ranking.get(indice);
	}

	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder("");
		for (int i = 0; i < getRanking().size(); i++) {
			cadena.append("\t" + "[" + (i + 1) + "] -> " + getRanking().get(i));
		}
		return cadena.toString();
	}

		
	}
	
	

