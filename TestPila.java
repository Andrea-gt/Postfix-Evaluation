import java.util.ArrayList;
import junit.framework.TestCase;

public class TestPila extends TestCase {
	private Stack Pila;
	
	public void InicializadorPila() { 
		Pila = new Stack();
		Pila.push(30);
		Pila.push(50);
	}

	public void testCount(){
		InicializadorPila();
		assertTrue(Pila.count() == 2);
	}
	
	public void testPeek(){
		InicializadorPila();
		assertEquals(50, Pila.peek());
	}
	
	public void testPull(){
		InicializadorPila();
		assertEquals(50, Pila.pull());
		assertEquals(30, Pila.pull());
	}
	
	public void testIsEmpty(){
		InicializadorPila();
		assertTrue(Pila.isEmpty() == false);
	}
}
