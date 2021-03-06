package vehiculos;

public class Serie {
	private String marca;
	private String modelo;
	private int aņoFabricacion;
	
	public Serie(String marca, String modelo, int aņoFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.aņoFabricacion = aņoFabricacion;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAņoFabricacion() {
		return aņoFabricacion;
	}
	
	public String toString() {
		return marca + "|" + modelo + "|" + aņoFabricacion;
	}
}
