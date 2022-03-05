

import junit.framework.TestCase;

public class TestCalcuadora  extends TestCase {
	private Calcuadorcalcu;
	public void escenario() {
		calcu= new Calcuador();
	}
	
	public void testIsNumeric() {
		escenario();
		assertTrue(calcu.isNumeric("2")==true);
	}
	public void testCalcular() {
		escenario();
		assertTrue(15 == Integer.parseInt(calcu.calcular("1 2 + 4 * 3 +")));
		
		
	}

}
