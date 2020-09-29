package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<>();
	
	//CONSTRUCTORES
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	//METODOS GET Y SET
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZona() {
		return zonas;
	}
	public void setZona(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
	
	//METODOS ADICIONALES
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
		((Zona) zonas).setZoo(this);
	}
	public int cantidadTotalAnimales() {
		return((Zona) zonas).cantidadAnimales();
	}

}