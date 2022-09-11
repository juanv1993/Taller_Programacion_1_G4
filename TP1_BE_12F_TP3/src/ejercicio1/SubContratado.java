package ejercicio1;

public class SubContratado extends Empleado {

	private float cantHoras;
	private float precioHora;
	
	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	
	@Override
	public float calcularPago() {
		return precioHora * cantHoras;
	}
	
	
	
	
	
	
	
}
