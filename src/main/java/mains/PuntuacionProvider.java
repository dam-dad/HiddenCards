package mains;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class PuntuacionProvider {

	public static List<Puntuacion> puntuaciones = new ArrayList<>();

	public static List<Puntuacion> getPuntuaciones() {	
		return puntuaciones;
	}

	public static void setPuntuaciones(Puntuacion puntuacion) {
		puntuaciones.add(puntuacion);
	}
	
	public static void generarPdf() throws JRException, IOException 
	{
		// compila el informe
		JasperReport report = JasperCompileManager.compileReport(PuntuacionProvider.class.getResourceAsStream("/pdf/puntuaciones.jrxml"));

		// mapa de parámetros para el informe
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		// generamos el informe (combinamos el informe compilado con los datos) 
        JasperPrint print  = JasperFillManager.fillReport(report, parameters, new JRBeanCollectionDataSource(getPuntuaciones()));
        
        // exporta el informe a un fichero PDF
        JasperExportManager.exportReportToPdfFile(print, "puntuaciones.pdf");
	}
}
