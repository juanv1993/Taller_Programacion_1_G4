package ejercicio2;

import ejercicio1.SubContratado;

public class Vendedor extends SubContratado {
	
	private float porcentaje;

	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}


	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public float calcularPago() {
		
		return super.calcularPago() *(	1 + (porcentaje/100))  ;
	}
	

}
