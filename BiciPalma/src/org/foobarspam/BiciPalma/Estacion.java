package org.foobarspam.BiciPalma;

public class Estacion {

	//----------Propiedades---------
	private int id= 0;
	private String direccion ="";
	private int numeroAnclajes;
	private int[] anclajes;
	
	//----------Constructores-------
	public Estacion(){
	}
	
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new int[numeroAnclajes];
	}
	
	//---------Getters y Settters-------
	public int getID(){
		return this.id;
	}
	public void setID(int id){
		this.id = id;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	public int getNumeroAnclajes(){
		return this.numeroAnclajes;
	}
	public void setNumeroAnclajes(int numeroAnclajes){
		this.numeroAnclajes = numeroAnclajes;
	}
	public int[] getAnclajes(){
		return this.anclajes;
	}
	
	//---------Métodos-----------
	public void consultarEstacion(){
		System.out.println("Id: " + getID());
		System.out.println("Direccion: " + getDireccion());
		System.out.println("Numero de anclajes: " + getNumeroAnclajes());
	}
	
	public int anclajesLibres(){
		int anclajesLibres = 0;
		for (int i : getAnclajes()){
			if (i == 0){
				anclajesLibres ++;
			}
		}
		return anclajesLibres;
	}
	
	public void consultarAnclajes(){
		
	}
	
	
	
}
