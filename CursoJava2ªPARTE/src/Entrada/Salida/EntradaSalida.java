package Entrada.Salida;

import java.io.*;
import java.io.IOException;

public class EntradaSalida {

	public static void main(String[] args) {
	
		
		try {
			
			String ruta = "/Users/judithandressanchez/Documents/iosalida.txt";
			
			String contenido = "Contenido de ejemplo";
			
			File file = new File(ruta);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter (file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("La vida es chachi piruli");
			bw.write("\nLa vida es chachi chachi chachi piruli");
			bw.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
