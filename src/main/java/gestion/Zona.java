package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<>();
	
	//CONSTRUCTORES
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
		
	}
	
	//METODOS GET Y SET
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public List<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	
	//METODOS ADICIONALES
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimales() {
		if (animales.isEmpty()) {
			return 0;
		}
		else {
			return animales.size(); 
		}
	}

}