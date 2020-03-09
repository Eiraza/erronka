package vehiculos;

public abstract class Vehiculo {
	
	private final String MATRICULA;
	private int numBastidor;
	private String color;
	private int numAsientos;
	private double precio;
	private Serie serie;
	
	private boolean repintado;
	
	
	public Vehiculo(String matricula) {
		MATRICULA = matricula;
	}

	public String getMatricula() {
		return MATRICULA;
	}
}
