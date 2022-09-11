package ejercicio1;

public abstract class Empleado {
	
	private String nombre;
	private int edad;
	
	
	public Empleado(String nombre, int edad) {
		
		setNombre(nombre);
		setEdad(edad);
	}


	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return this.getClass().getSimpleName() +":  "+" Nombre : "+nombre+", edad : "+getEdad() + ", Sueldo : "+calcularPago();
	}
	
	public float calcularPago() {
		return 0.0F;
	}
	
}
