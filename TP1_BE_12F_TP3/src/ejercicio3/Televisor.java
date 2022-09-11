package ejercicio3;

public class Televisor extends Electrodomestico {
	
	private int dimension;
	private boolean esSmart;
	
	
	public Televisor(String marca, String modelo, String serie, int voltaje, boolean estado, double precio,
			int dimension, boolean esSmart) {
		super(marca, modelo, serie, voltaje, estado, precio);
		this.dimension = dimension;
		this.esSmart = esSmart;
	}

	private String smart () {
		String tecnologia;
		if(esSmart) {
		tecnologia = "Smart TV";	
		} else {
		tecnologia = "No es Smart";	
		}
		return tecnologia;
	}

	@Override
	public String mostrarDatosCompletos() {
		return super.mostrarDatosCompletos() + "\n Dimension : "+ dimension + "\n Es smart :"+smart();
	}
	
	

}
