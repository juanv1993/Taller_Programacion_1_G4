package ejercicio3;

public class Licuadora extends Electrodomestico {
	
	private int potencia;
	private int cantVelocidades;
	
	
	public Licuadora(String marca, String modelo, String serie, int voltaje, boolean estado, double precio,
			int potencia, int cantVelocidades) {
		super(marca, modelo, serie, voltaje, estado, precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}
	
	@Override
	public String mostrarDatosCompletos() {
		return super.mostrarDatosCompletos() + "\nPotencia ;"+ potencia +"\nCantida de velocidades :"+cantVelocidades;
	}

}
