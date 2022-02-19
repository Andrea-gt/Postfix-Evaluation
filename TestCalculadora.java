/**
 * @author Andrea Ximena Ramirez Recinos
 * @version 19/02/2022
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos | Seccion 20
 * Andrea Ximena Ramirez Recinos, carne 21874
 * Clase TestCalculadora para prueba JUnit de metodo EvaluarLinea
 */

import junit.framework.TestCase;

public class TestCalculadora extends TestCase{
	private Calculadora CalculadoraExpresiones;
	private String expresion = "8 9 2 + *";
	
	public void InicializadorCalculadora() { 
		CalculadoraExpresiones = new Calculadora();
	}
	
	public void testEvaluar () {
		InicializadorCalculadora();
		assertTrue(CalculadoraExpresiones.EvaluarLinea(expresion) == 88);
	}
}
