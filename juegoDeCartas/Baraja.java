package juegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	private ArrayList<Carta> baraja;

	public ArrayList<Carta> getBaraja() {
		return baraja;
	}
	/**
	 * Constructor del objeto Baraja
	 */
	public Baraja() {
		baraja = new ArrayList<Carta>();
		for(Palo palo : Palo.values()){
			for(Figura figura : Figura.values()){
				baraja.add(new Carta(palo,figura));
			}
		}
		Collections.shuffle(baraja);
	}
	/**
	 * Extrae una carta de la Baraja
	 * @return Carta extraida
	 */
	
	Carta extraerCarta(){
		Carta carta = baraja.get(0);
		baraja.remove(0);
		return carta;
		
	}

	@Override
	public String toString() {
		return "-----BARAJA------\n"+baraja;
	}
	
}
