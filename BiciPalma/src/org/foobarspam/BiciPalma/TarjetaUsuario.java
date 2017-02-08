package org.foobarspam.BiciPalma;

public class TarjetaUsuario {

	//----------Propiedades---------
	private String id = "";
	private boolean activada = false;
	
	//----------Constructores-------
	public TarjetaUsuario(){
	}
	
	public TarjetaUsuario(String id, boolean activada){
		this.id = id;
		this.activada = activada;
	}
	
	//---------Getters y Settters-------
	public String getID(){
		return this.id;
	}
	public void setID(String id){
		this.id = id;
	}
	public boolean getActivada(){
		return this.activada;
	}
	public void setActivada(boolean activada){
		this.activada = activada;
	}
	
}
