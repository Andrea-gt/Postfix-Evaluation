/**
 * 
 */

/**
 * @author Andrea
 * @version 19/02/2022
 * 
 */
public class controlador {

	Stack <Integer> stack =new Stack<>();

	public <T> int EvaluarLinea (String expresion) {

		for(int i=0;i<expresion.length();i++)
		{
			char datoPrimitivo = expresion.charAt(i);

			//Si el dato es un numero
			if(Character.isDigit(datoPrimitivo)) {
				stack.push(datoPrimitivo - '0');
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
