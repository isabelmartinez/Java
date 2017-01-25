package ejercicio.clases.geometricas;

public class Elipse extends FiguraGeometrica{

	private double ejeMayor = 0d;
	private double ejeMenor = 0d;
	private final double PI = Math.PI;
	
	public Elipse() {
		super();
	}
	
	public Elipse(double ejeMayor, double ejeMenor){
		super();
		this.ejeMayor = ejeMayor;
		this.ejeMenor = ejeMenor;
	}
	
	public Elipse(String nombre, double ejeMayor, double ejeMenor){
		super(nombre);
		this.ejeMayor = ejeMayor;
		this.ejeMenor = ejeMenor;
	}
	
	public double getejeMayor(){
		return this.ejeMayor;
	}
	
	public void setejeMayor(double ejeMayor){
		this.ejeMayor = ejeMayor;
	}
	
	public double getejeMenor(){
		return this.ejeMenor;
	}
	
	public void setejeMenor(double ejeMenor){
		this.ejeMenor = ejeMenor;
	}
	
	@Override
	public double area(){
		return PI * getejeMayor() * getejeMenor();
	}
	
	
}
