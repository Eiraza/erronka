package vehiculos;

public class Serie {
	private String marca;
	private String modelo;
	private int a�oFabricacion;
	
	public Serie(String marca, String modelo, int a�oFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.a�oFabricacion = a�oFabricacion;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getA�oFabricacion() {
		return a�oFabricacion;
	}
	
	public String toString() {
		return marca + "|" + modelo + "|" + a�oFabricacion;
	}
}
