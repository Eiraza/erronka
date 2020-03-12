package vehiculos;

public class Camion extends Vehiculo{
	private float carga; //peso
	private char tipoMercancia;
	
	public Camion(String matricula, int numBastidor, String color, int numAsientos, double precio, String marca, String modelo, int añoFab, float carga, char tipoMercancia) {
		super(matricula, numBastidor, color, numAsientos, precio, marca, modelo, añoFab);
		this.carga = carga;
		setTipoMercancia(tipoMercancia);
	}
	
	private void setTipoMercancia(char letra) {
		
		if (letra == 'g' || letra == 'G') {
			tipoMercancia = 'G';
			return ;
		}
		
		if (letra == 'a' || letra == 'A') {
			tipoMercancia = 'A';
			return;
		}
		
		if (letra == 'p' || letra == 'P') {
			tipoMercancia = 'P';
			return ;
		}
		System.out.println("Error: tipo de mercancia no valida");
	}

	/**
	 * @return the carga
	 */
	public float getCarga() {
		return carga;
	}

	/**
	 * @return the tipoMercancia
	 */
	public char getTipoMercancia() {
		return tipoMercancia;
	}
	
	
}

