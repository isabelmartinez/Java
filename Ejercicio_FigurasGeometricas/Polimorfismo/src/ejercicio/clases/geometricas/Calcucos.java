package ejercicio.clases.geometricas;

import java.util.ArrayList;

public class Calcucos {

	public static void main(String[] args) {
		
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
	
		Rectangulo rectanguloConstructorLocal = new Rectangulo("rect�ngulo", 3, 4);
		
		figuras.add(rectanguloConstructorLocal);
		
		Cuadrado cuadradoConstructorLocal = new Cuadrado("cuadrado", 3);

		figuras.add(cuadradoConstructorLocal);
		
		Circulo circuloConstructorLocal = new Circulo("c�rculo", 5);
		
		figuras.add(circuloConstructorLocal);
		
		Elipse elipseConstructorLocal = new Elipse("elipse", 2, 3);
		
		figuras.add(elipseConstructorLocal);
				
		for (FiguraGeometrica figura : figuras){
			System.out.println("El area del " + figura.getNombre() + " es " + figura.area());
		}

	}

}