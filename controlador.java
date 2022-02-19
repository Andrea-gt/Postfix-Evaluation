/**
 * @author Andrea Ximena Ramirez Recinos
 * @version 19/02/2022
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos | Seccion 20
 * Andrea Ximena Ramirez Recinos, carne 21874
 * Programa para la evaluacion de expresiones postfix
 */
public class controlador {

	Stack <Integer> stack =new Stack<>();

	/**
	 * @param <T>
	 * @param expresion
	 * @return int
	 * Metodo para evaluar la expresion ingresada 
	 */
	
	public <T> int EvaluarLinea (String expresion) {
	
		for(int i=0;i<expresion.length();i++)
		{
			char datoPrimitivo = expresion.charAt(i);
			
			if(datoPrimitivo == ' ')continue; // Obtenido de GeeksforGeeks.com
			
			//Si el dato es un numero
			if(Character.isDigit(datoPrimitivo)) {
				stack.push(datoPrimitivo - '0'); // Manejo de variables char obtenido de GeeksforGeeks.com
			}

			//Si el dato es un operando
			else { 

				int value_1 = stack.pull();
				int value_2 = stack.pull();

				switch(datoPrimitivo) {

				case '+':
					stack.push(value_1+value_2);
					break;

				case '-':
					stack.push(value_1 - value_2);
					break;

				case '*':
					stack.push(value_1 * value_2);
					break;

				case '/':
					stack.push(value_1 / value_2);
					break;
				}
			}
		}
		return stack.pull();
	}
}
