package juegoDeCartas;

public class Carta {
	private Palo palo;
	private Figura figura;
	
	Palo getPalo() {
		return palo;
	}
	void setPalo(Palo palo) {
		this.palo = palo;
	}
	Figura getFigura() {
		return figura;
	}
	 void setFigura(Figura figura) {
		this.figura = figura;
	}
	
	Carta(Palo palo,Figura figura){
		setPalo(palo);
		setFigura(figura);
	}

	public String toString() {
		return figura + " DE "+ palo +"\n";
	}

}
