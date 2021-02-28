package mains;

/**
 * Recoje la puntuacion del juego
 * 
 * @author Hidden cards
 *
 */
public class Puntuacion {

	private int fallos;
	private String tiempo;

	public Puntuacion() {
	}

	/**
	 * guarda los datos
	 * 
	 * @param fallos
	 * @param tiempo
	 */
	public Puntuacion(int fallos, String tiempo) {
		super();
		this.fallos = fallos;
		this.tiempo = tiempo;
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
