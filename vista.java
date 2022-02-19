import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class vista {

	public static void main(String[] args) {
		controlador ctr = new controlador();
		FileInputStream fstream;
		
		System.out.println("Calculadora para expresiones Postfix");
		Scanner sn = new Scanner(System.in); 
		System.out.println("\nPor favor ingrese el enlace del archivo a evaluar");
		String path = sn.nextLine();
		
		try {
			fstream = new FileInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			
			String strLine;

			//Leer Archivo Linea por Linea
			while ((strLine = br.readLine()) != null)   {
				
				// Evaluar Linea
				System.out.println ("Resultado de " + strLine + ": " + ctr.EvaluarLinea(strLine));
			}

			//Cerrar el input
			fstream.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Dirección Inválida");
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("La expresion es indefinida");
		}
	}
}
