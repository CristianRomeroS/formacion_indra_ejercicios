package excepciones;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Fechas {

	public static void main(String[] args) {
		
		Date objDate = new Date ();
		
		System.out.println("Fecha de hoy: "+objDate);
		String formato = "hh:mm:ss a dd/MMM/yyyy";
		
		SimpleDateFormat objSDF = new SimpleDateFormat(formato);

		System.out.println("Fecha con nuevo formato: "+objSDF.format(objDate));
	}

}
