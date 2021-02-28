package mains;

import java.util.ArrayList;
import java.util.List;

public class PuntuacionProvider {

	private static List<Puntuacion> puntuaciones = new ArrayList<>();

	public static List<Puntuacion> getPuntuaciones() {
		return puntuaciones;
	}

	public void setPuntuaciones(Puntuacion puntuacion) {
		puntuaciones.add(puntuacion);
	}
}
