package vehiculos;

public abstract class Vehiculo {
	
	private final String MATRICULA;
	private int numBastidor;
	private String color;
	private int numAsientos;
	private double precio;
	private Serie serie;
	
	private boolean repintado;
	
	
	public Vehiculo(String matricula, int numBastidor, String color, int numAsientos, double precio, Serie serie) {
		MATRICULA = matricula;
		this.numBastidor = numBastidor;
		this.color = color;
		this.numAsientos = numAsientos;
		this.precio = precio;
		this.serie = serie;
	}
	
	/**
	 * @return the Matricula
	 */
	public String getMatricula() {
		return MATRICULA;
	}

	/**
	 * @return the numBastidor
	 */
	public int getNumBastidor() {
		return numBastidor;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the numAsientos
	 */
	public int getNumAsientos() {
		return numAsientos;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}

	/**
	 * @return the repintado
	 */
	public boolean isRepintado() {
		return repintado;
	}
	
	/**
	 * @param repintado
	 */
	public void setRepintado(boolean repintado) {
		 this.repintado = repintado; 
	}

	public Vehiculo(String matricula, int numBastidor, String color, int numAsientos, double precio, String marca, String modelo, int añoFabricacion) {
		this(matricula, numBastidor, color, numAsientos, precio, new Serie(marca, modelo, añoFabricacion));
	}

}
