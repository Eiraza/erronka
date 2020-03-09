package vehiculos;

public class Coche extends Vehiculo{
	
	private int numPuertas;
	private float capacidadMaletero;
	
	public Coche(String matricula, int numBastidor, String color, int numAsientos, double precio, String marca, String modelo, int añoFab, int numPuertas, float capacidadMaletero) {
		super(matricula, numBastidor, color, numAsientos, precio, marca, modelo, añoFab);
		this.numPuertas = numPuertas;
		this.capacidadMaletero = capacidadMaletero;
	}

	/**
	 * @return the numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}

	/**
	 * @return the capacidadMaletero
	 */
	public float getCapacidadMaletero() {
		return capacidadMaletero;
	}
	
}
