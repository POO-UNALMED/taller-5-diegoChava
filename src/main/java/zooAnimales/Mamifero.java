package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	//CONTRUCTORES
	
	public Mamifero(String nombre, int edad, String habitat, String genero,boolean pelaje,int patas) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	public Mamifero() {
		listado.add(this);
	}
	
	//METODOS GET Y SET
	
	public List<Mamifero> getListado() {
		return listado;
	}
	public void setListado(List<Mamifero> listado) {
		this.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	//METODOS ADICIONALES
	public static int cantidadMamiferos(){
			if (listado.isEmpty()) {
				return 0;
			}
			else {
				return listado.size(); 
			}
		}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero cabaio = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return cabaio;
	}

	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero simba = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return simba;
	}
}