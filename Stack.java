/**
 * @author Andrea Ximena Ramirez Recinos
 * @version 19/02/2022
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos | Seccion 20
 * Andrea Ximena Ramirez Recinos, carne 21874
 * Clase Pila
 */
import java.util.ArrayList;

public class Stack<T> implements IStack<T> {

		private ArrayList<T> coreList;

		public Stack() {
			coreList = new ArrayList<T>();
		}

		@Override
		public void push(T value) {		
			coreList.add(0, value);
		}

		@Override
		public T pull() {
			return coreList.remove(0);
		}

		@Override
		public T peek() {
			return coreList.get(0);
		}

		@Override
		public int count() {
			return coreList.size();
		}

		@Override
		public boolean isEmpty() {		
			return coreList.isEmpty();
		}
	}
