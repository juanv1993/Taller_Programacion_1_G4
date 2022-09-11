package ejercicio3;

public class Heladera extends Electrodomestico {
	
	private int capacidad;
	private boolean esNoFrost;
	
	
	public Heladera(String marca, String modelo, String serie, int voltaje, boolean estado, double precio,
			int capacidad, boolean esNoFrost) {
		super(marca, modelo, serie, voltaje, estado, precio);
		this.capacidad = capacidad;
		this.esNoFrost = esNoFrost;
	}
	
	
	@Override
	public String mostrarDatosCompletos() {
		return super.mostrarDatosCompletos() + "\nCapacidad : " +capacidad+ "\nEs No FROST :  "+ esNoFrost;
	}
	

}
