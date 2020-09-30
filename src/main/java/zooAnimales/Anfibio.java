package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	//CONSTRUCTORES
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public Anfibio() {
		listado.add(this);
	}
	
	//METODOS GET Y SET
	
	
	public void setListado(List<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	//METODOS ADICIONALES
	
	public static int cantidadAnfibios(){
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size(); 
		}
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio anfi = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		return anfi;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio charizard = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
		return charizard;
	}
}