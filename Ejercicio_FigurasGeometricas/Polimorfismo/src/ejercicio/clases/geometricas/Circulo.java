package ejercicio.clases.geometricas;

public class Circulo extends FiguraGeometrica {

	private double radio = 0d;
	private final double PI = Math.PI;
	
	public Circulo(){
		super();
	}
	
	public Circulo(double radio){
		super();
		this.radio = radio;
	}
	
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}

	@Override
	public double area() {
		// para elevar algo en java, se utiliza Math.pow(a,b):
		// donde a es la base y b el exponente. En este cado elevamos radio a 2.
		return PI * Math.pow(this.radio, 2);
	}
}