package ejercicio.clases.geometricas;

public class Cuadrado extends FiguraGeometrica{
	//propiedad privada
	private double lado = 0d;
	
	public Cuadrado(){
		super();
	}
	
	public Cuadrado(double lado){
		super();
		this.lado = lado;
	}
	
	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	
	@Override
	public double area() {
		return Math.pow(this.lado, 2);
	}
}
