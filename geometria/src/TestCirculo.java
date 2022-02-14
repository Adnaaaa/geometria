import static org.junit.Assert.*;

import org.junit.Test;

public class TestCirculo {

	@Test
	public void testArea() {
		Circulo_ABG cir = new Circulo_ABG (-3.0, "circulo");
		double res=cir.area();
		assertEquals(28.27,res,0.1);
	}

	@Test
	public void testPerimetro() {
		Circulo_ABG cir = new Circulo_ABG (-1.0, "circulo");
		double res=cir.perimetro();
		assertEquals(6.28,res,0.1);
	}

}
