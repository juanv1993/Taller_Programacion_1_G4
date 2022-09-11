package ejercicio3;

public abstract class Electrodomestico {
	
	private String marca;
	private String modelo;
	private String serie;
	private int voltaje;
	private boolean estado;
	private double precio;
	
	
	public Electrodomestico(String marca, String modelo, String serie, int voltaje, boolean estado, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.serie = serie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", serie=" + serie + ", voltaje=" + voltaje
				+ ", estado=" + estado + ", precio=" + precio + "]";
	}
	
	// datos para exhibir en la lista de venta inicial
	public String datosProducto() {
		return this.getClass().getSimpleName()+ " : \nMarca  "+this.marca+ " \nModelo :  "+this.modelo;		
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	// datos a ser exhibidos en la factura ticket final - se hace override en las clases hijas.
	public  String mostrarDatosCompletos() {
		return datosProducto() + "\nSerie :  " + serie + "\nVoltaje :"+ voltaje + "\nPrecio del articulo : "+ precio;
	}
	
	public void datosListaVenta() {
		System.out.println(datosProducto());
	}
	

}
