
public class Circulo_ABG extends FiguraGeometrica_ABG {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_ABG(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		
		}
	
	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		if (radio<0) 
			radio=radio*(-1);
		return radio * 2 * PI;
	}

}
