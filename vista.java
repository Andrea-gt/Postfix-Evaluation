/**
 * @author Andrea Ximena Ramirez Recinos
 * @version 19/02/2022
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos | Seccion 20
 * Andrea Ximena Ramirez Recinos, carne 21874
 * Clase Vista, donde se imprime todo y se solician inputs
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class vista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora ctr = new Calculadora();
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
		
		// Manejo de errores
	
		catch (FileNotFoundException e) {
			System.out.println("Dirección Inválida");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("La expresion es indefinida");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("No hay argumentos validos o suficientes");
		}
	}
}
