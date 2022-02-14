/**
 * @version 1.2, 14/02/2022
 * @author Adri�n Butr�n Gutierrez
 *
 */
public class Rectangulo_ABG extends FiguraGeometrica_ABG {
/**
 * Constructor
 * @author Adri�n Butr�n
 */
	private double l1;
	private double l2;
/**
 * 	Constructor de la clase rectangulo, nos pide el tipo de figura y los parametros de los lados
 * @param tipoFigura
 * @param lG lado
 * @param lP lado
 * @return Devuelve los par�metros de entrada el texto que contiene la entrada
 */
	public Rectangulo_ABG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

/**
 * @returndevuelve el �rea 	
 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
/**
 * @return devuelve el per�metro
 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
