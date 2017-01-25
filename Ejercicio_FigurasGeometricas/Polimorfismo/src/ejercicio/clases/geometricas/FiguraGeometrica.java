package ejercicio.clases.geometricas;


public abstract class FiguraGeometrica {
	
	private String nombre;
	
	public FiguraGeometrica(){
		this.nombre = "undefined";
	};
		
	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
	};
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public abstract double area();

}