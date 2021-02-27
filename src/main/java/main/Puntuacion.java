package main;

public class Puntuacion {

	private int aciertos;
	private int fallos;
	private String tiempo;
	
	public Puntuacion() {
	}

	public Puntuacion(int aciertos, int fallos) {
		super();
		this.aciertos = aciertos;
		this.fallos = fallos;
	}

	public int getAciertos() {
		return aciertos;
	}

	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}

	public int getFallos() {
		return fallos;
	}

	public void setFallos(int fallos) {
		this.fallos = fallos;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
}
