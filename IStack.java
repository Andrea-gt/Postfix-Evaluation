/**
 * @author Andrea Ximena Ramirez Recinos
 * @version 19/02/2022
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos | Seccion 20
 * Andrea Ximena Ramirez Recinos, carne 21874
 * Interfaz de Pila
 */
public interface IStack<T> {

	void push(T value);

	T pull();

	T peek();

	int count();

	boolean isEmpty();
}