import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.io.InputStreamReader;


public class vista {

	public static void main(String[] args) {
		int linea = 0;
		FileInputStream fstream;
		try {
			fstream = new FileInputStream("test.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String strLine;

			//Leer Archivo Linea por Linea
			while ((strLine = br.readLine()) != null)   {
				
				// Imprimir Resultados
				System.out.println (linea +". "+ strLine);
				linea++;
			}

			//Cerrar el input
			fstream.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
