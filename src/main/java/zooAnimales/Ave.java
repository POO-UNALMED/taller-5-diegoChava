package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
	private static List<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	//CONSTRUCTORES

	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad,habitat,genero);
		listado.add(this);
	}
	public Ave() {
		listado.add(this);
	}
	
	//METODOS GET Y SET
	
	public List<Ave> getListado() {
		return listado;
	}
	public void setListado(List<Ave> listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	//METODOS ADICIONALES
	
	public static int cantidadAves(){
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size(); 
		}
	}

	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return halcon;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return aguila;
	}
}