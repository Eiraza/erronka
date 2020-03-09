package vehiculos;

public class Serie {
	private String marca;
	private String modelo;
	private int añoFabricacion;
	
	public Serie(String marca, String modelo, int añoFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAñoFabricacion() {
		return añoFabricacion;
	}
	
	public String toString() {
		return marca + "|" + modelo + "|" + añoFabricacion;
	}
}
