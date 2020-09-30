package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	private static List<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	//CONTRUCTORES
	
	public Reptil(String nombre, int edad, String habitat, String genero ,String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public Reptil() {
		listado.add(this);
	}
	
	//METODOS GET Y SET
	
	public List<Reptil> getListado() {
		return listado;
	}
	public void setListado(List<Reptil> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	//METODOS ADICIONALES
	
	public static int cantidadReptiles() {
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size(); 
		}
	}

	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iwana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return iwana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return serpiente;
	}
}